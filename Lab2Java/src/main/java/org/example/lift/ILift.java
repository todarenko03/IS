package org.example.lift;

import org.example.sm.Pair;

import java.util.List;

public interface ILift {
    void moveUp();
    void moveDown();
    void openDoors(boolean directionIsUp);
    void closeDoors();
    boolean isEmpty();
    boolean isNeedToGoOut();
    int getCurrentFloor();
    List<Pair<List<Integer>, Integer>> getLogs();
}
