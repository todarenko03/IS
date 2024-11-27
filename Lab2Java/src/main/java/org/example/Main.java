package org.example;

import org.example.building.Building;
import org.example.building.IBuilding;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer[]> requests = new ArrayList<>();
        requests.add(new Integer[] {1, 3});
        requests.add(new Integer[] {3, 4});
        requests.add(new Integer[] {2, 3});
        requests.add(new Integer[] {3, 1});
        requests.add(new Integer[] {4, 2});
        IBuilding building = new Building(requests, 5, new int[] {5, 5});
        building.start();
        building.getLogs();
    }
}
