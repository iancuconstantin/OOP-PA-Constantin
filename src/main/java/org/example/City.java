package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class City extends Location{
    private String name;


    public City(int pointX, int pointY, String name) {
        super(pointX, pointY);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Landmark> nearLandmarks(List<Landmark> landmarks){
        return landmarks.stream().filter(landmark -> landmark.getPointX()-getPointX() + landmark.getPointY()+getPointY() < 50)
                .collect(Collectors.toList());
    }
}
