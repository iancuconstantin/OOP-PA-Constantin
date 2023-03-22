package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Location {
    private int pointX;
    private int pointY;

    public Location(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public  int getPointX() {
        return pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public City getClosestCity(List<Location> locationList){
        List<City> cities = new ArrayList<>();
        for (Location location:locationList){
            if(location instanceof City){
                cities.add((City)location);
            }
        }

        City closestOne = cities.get(0);

        for(City city: cities){
            if(city.getPointX()-getPointX() + city.getPointY()-getPointY() <
                    closestOne.getPointX()-getPointX() + closestOne.getPointY()-getPointY()){
                closestOne = city;
            }
        }
        return closestOne;
    }
}
