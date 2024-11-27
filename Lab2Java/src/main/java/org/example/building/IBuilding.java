package org.example.building;

public interface IBuilding {
    void start();
    boolean requestToUp(int floorNumber);
    boolean requestToDown(int floorNumber);
    boolean nearestIsUp(String state, int floorNumber);
    boolean nearestIsDown(String state, int floorNumber);
    void getLogs();
}
