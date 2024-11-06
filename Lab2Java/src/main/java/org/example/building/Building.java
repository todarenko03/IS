package org.example.building;

import org.example.lift.ILift;
import org.example.lift.Lift;
import org.example.sm.*;

import java.util.*;

public class Building implements IBuilding {
    private final Map<Integer, List<Integer>> requestsMap;
    private final int numberOfFloors;
    private final ILift[] lifts;

    public Building(final List<Integer[]> requests, final int numberOfFloors, final int[] liftPositions) {
        requestsMap = new HashMap<>();
        for (int i = 1; i <= numberOfFloors; i++) {
            requestsMap.put(i, new ArrayList<>());
        }
        for (Integer[] request: requests) {
            requestsMap.get(request[0]).add(request[1]);
        }
        this.numberOfFloors = numberOfFloors;
        lifts = new Lift[] {
                new Lift(numberOfFloors, liftPositions[0], requestsMap),
                new Lift(numberOfFloors, liftPositions[1], requestsMap)
        };
    }

    @Override
    public void start() {
        IState state1 = new State(Configuration.DOORS_CLOSE_EMPTY);
        IState state2 = new State(Configuration.DOORS_CLOSE_EMPTY);

        Configuration configuration1 = new Configuration(lifts[0], state1);
        Configuration configuration2 = new Configuration(lifts[1], state2);

        ICommandRepository commands1 = configuration1.getCommand();
        ICommandRepository commands2 = configuration2.getCommand();

        IStateTransitions states1 = configuration1.getState();
        IStateTransitions states2 = configuration2.getState();

        while (!Objects.equals(state1.getName(), Configuration.DONE) || !Objects.equals(state2.getName(), Configuration.DONE)) {

            List<Boolean> conditions1 = new ArrayList<>();
            conditions1.add(!lifts[0].isEmpty()
                    & (Objects.equals(state1.getName(), Configuration.DOORS_OPEN_UP)
                    | Objects.equals(state1.getName(), Configuration.DOORS_OPEN_DOWN)));
            conditions1.add(lifts[0].isNeedToGoOut());
            conditions1.add(requestToUp(lifts[0].getCurrentFloor()));
            conditions1.add(requestToDown(lifts[0].getCurrentFloor()));
            conditions1.add(nearestIsDown(state2.getName(), lifts[0].getCurrentFloor()));
            conditions1.add(nearestIsUp(state2.getName(), lifts[0].getCurrentFloor()));
            conditions1.add(checkMoveIsImpossible(lifts[0].getCurrentFloor(), state1.getName()));

            List<Boolean> conditions2 = new ArrayList<>();
            conditions2.add(!lifts[1].isEmpty()
                    & (Objects.equals(state2.getName(), Configuration.DOORS_OPEN_UP)
                    | Objects.equals(state2.getName(), Configuration.DOORS_OPEN_DOWN)));
            conditions2.add(lifts[1].isNeedToGoOut());
            conditions2.add(requestToUp(lifts[1].getCurrentFloor()));
            conditions2.add(requestToDown(lifts[1].getCurrentFloor()));
            conditions2.add(nearestIsDown(state1.getName(), lifts[1].getCurrentFloor()));
            conditions2.add(nearestIsUp(state1.getName(), lifts[1].getCurrentFloor()));
            conditions2.add(checkMoveIsImpossible(lifts[1].getCurrentFloor(), state2.getName()));

            commands1.getCommand(state1, conditions1.indexOf(true) + 1).execute();
            commands2.getCommand(state2, conditions2.indexOf(true) + 1).execute();

            state1.setName(states1.nextState(state1, conditions1.indexOf(true) + 1).getName());
            state2.setName(states2.nextState(state2, conditions2.indexOf(true) + 1).getName());
        }
    }

    @Override
    public boolean requestToUp(final int floorNumber) {
        return requestsMap.get(floorNumber).stream().anyMatch(x -> x > floorNumber);
    }

    @Override
    public boolean requestToDown(final int floorNumber) {
        return requestsMap.get(floorNumber).stream().anyMatch(x -> x < floorNumber);
    }

    @Override
    public boolean nearestIsUp(final String state, final int floorNumber) {
        return Objects.equals(state, Configuration.DOORS_OPEN_UP) || Objects.equals(state, Configuration.DOORS_CLOSE_UP)  ?
                checkUpIfOtherLiftMoveUp(floorNumber)
                :
                checkUpIfOtherLiftMoveDown(floorNumber);
    }

    @Override
    public boolean nearestIsDown(final String state, final int floorNumber) {
        return Objects.equals(state, Configuration.DOORS_OPEN_UP) || Objects.equals(state, Configuration.DOORS_CLOSE_UP) ?
                checkDownIfOtherLiftMoveUp(floorNumber)
                :
                checkDownIfOtherLiftMoveDown(floorNumber);
    }

    private boolean checkUpIfOtherLiftMoveUp(final int floorNumber) {
        int targetFloor = floorNumber;
        while (targetFloor >= 1) {
            if (!requestsMap.get(targetFloor).isEmpty()) {
                return false;
            }
            targetFloor--;
        }
        return checkUp(floorNumber);
    }

    private boolean checkUpIfOtherLiftMoveDown(final int floorNumber) {
        return checkUp(floorNumber);
    }

    private boolean checkUp(final int floorNumber) {
        int targetFloor = floorNumber;
        while (targetFloor <= numberOfFloors) {
            if (!requestsMap.get(targetFloor).isEmpty()) {
                return true;
            }
            targetFloor++;
        }
        return false;
    }

    private boolean checkDownIfOtherLiftMoveUp(final int floorNumber) {
        int targetFloor = floorNumber;
        while (targetFloor <= numberOfFloors) {
            if (!requestsMap.get(targetFloor).isEmpty()) {
                return false;
            }
            targetFloor++;
        }
        return checkDown(floorNumber);
    }

    private boolean checkDownIfOtherLiftMoveDown(final int floorNumber) {
        return checkDown(floorNumber);
    }

    private boolean checkDown(final int floorNumber) {
        int targetFloor = floorNumber;
        while (targetFloor >= 1) {
            if (!requestsMap.get(targetFloor).isEmpty()) {
                return true;
            }
            targetFloor--;
        }
        return false;
    }

    private boolean checkMoveIsImpossible(final int floorNumber, final String stateName) {
        return (floorNumber >= numberOfFloors && Objects.equals(stateName, Configuration.DOORS_CLOSE_UP))
                || (floorNumber <= 1 && Objects.equals(stateName, Configuration.DOORS_CLOSE_DOWN));
    }

    public void getLogs() {
        for (Pair<List<Integer>, Integer> pair : lifts[0].getLogs()) {
            System.out.println(pair.getFirst() + " " + pair.getSecond());
        }
        for (Pair<List<Integer>, Integer> pair : lifts[1].getLogs()) {
            System.out.println(pair.getFirst() + " " + pair.getSecond());
        }
    }
}
