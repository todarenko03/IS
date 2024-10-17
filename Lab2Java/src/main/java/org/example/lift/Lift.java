package org.example.lift;

import org.example.sm.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lift implements ILift {

    private int currentFloor;
    private final Map<Integer, Integer> passengers;
    private final int numberOfFloors;
    private final Map<Integer, List<Integer>> requestsMap;
    private final List<Pair<List<Integer>, Integer>> log1;
    private final List<Pair<List<Integer>, Integer>> log2;

    public Lift(final int numberOfFloors, final int currentFloor, final Map<Integer, List<Integer>> requestsMap) {
        this.passengers = new HashMap<>();
        for (int i = 1; i <= numberOfFloors; i++) {
            passengers.put(i, 0);
        }
        this.numberOfFloors = numberOfFloors;
        this.currentFloor = currentFloor;
        this.requestsMap = requestsMap;
        this.log1 = new ArrayList<>();
        this.log2 = new ArrayList<>();
    }

    @Override
    public void moveUp() {
        if (currentFloor >= numberOfFloors) {
            throw new RuntimeException("Current floor more then number of floors");
        }
        currentFloor++;
        for (Pair<List<Integer>, Integer> pair: log1) {
            pair.setSecond(pair.getSecond() + 1);
        }
    }

    @Override
    public void moveDown() {
        if (currentFloor <= 1) {
            throw new RuntimeException("Current floor less then 1");
        }
        currentFloor--;
        for (Pair<List<Integer>, Integer> pair: log1) {
            pair.setSecond(pair.getSecond() + 1);
        }
    }

    @Override
    public void openDoors(boolean directionIsDown) {
        passengers.put(currentFloor, 0);
        log1.stream().filter(x -> x.getFirst().get(1) == currentFloor).forEach(log2::add);
        log2.stream().filter(x -> x.getFirst().get(1) == currentFloor).forEach(log1::remove);
        if (directionIsDown) {
            handlePassengersMovesDown();
        } else {
            handlePassengersMovesUp();
        }
    }

    @Override
    public void closeDoors() {}

    @Override
    public boolean isEmpty() {
        return passengers.values().stream().allMatch(x -> x == 0);
    }

    @Override
    public boolean isNeedToGoOut() {
        return passengers.get(currentFloor) > 0;
    }

    @Override
    public int getCurrentFloor() {
        return currentFloor;
    }

    @Override
    public List<Pair<List<Integer>, Integer>> getLogs() {
        return log2;
    }

    private void handlePassengersMovesUp() {
        requestsMap.get(currentFloor).stream()
                .filter(x -> x > currentFloor)
                .forEach(x ->
                {
                    passengers.put(x, passengers.get(x) + 1);
                    log1.add(new Pair<>(new ArrayList<Integer>() {{ add(currentFloor); add(x); } }, 0));
                });
        requestsMap.get(currentFloor).removeIf(x -> x > currentFloor);
    }

    private void handlePassengersMovesDown() {
        requestsMap.get(currentFloor).stream()
                .filter(x -> x < currentFloor)
                .forEach(x ->
                {
                    passengers.put(x, passengers.get(x) + 1);
                    log1.add(new Pair<>(new ArrayList<Integer>() {{ add(currentFloor); add(x); } }, 0));
                });
        requestsMap.get(currentFloor).removeIf(x -> x < currentFloor);
    }
}
