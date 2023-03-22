package org.example;

import java.util.ArrayList;
import java.util.List;

public class Planner {
    public List<Location> locationList;

    public Planner(List<Location> locationList) {
        this.locationList = new ArrayList<Location>();
    }

    public List<Location> getLocationList() {
        return locationList;
    }
}
