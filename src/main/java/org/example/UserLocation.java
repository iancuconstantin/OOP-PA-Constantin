package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserLocation extends Location{
    private List<Integer[]> locationHistory;


    public UserLocation(int pointX, int pointY) {
        super(pointX, pointY);
        this.locationHistory = new ArrayList<>();
        locationHistory.add(new Integer[]{pointX,pointY});
    }

    public List<Integer[]> getLocationHistory() {
        return locationHistory;
    }

    public void setLocation(int x,int y){
        locationHistory.add(new Integer[]{x,y});
    }
}
