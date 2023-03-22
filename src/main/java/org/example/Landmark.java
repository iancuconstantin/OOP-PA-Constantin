package org.example;

public class Landmark extends Location{
    private String name;
    private int entranceFee;
    private TypeOfLandmarks typeOf;

    public Landmark(int pointX, int pointY, String name, int entranceFee, TypeOfLandmarks typeOf) {
        super(pointX, pointY);
        this.name = name;
        this.entranceFee = entranceFee;
        this.typeOf = typeOf;
    }

    public String getName() {
        return name;
    }

    public int getEntranceFee() {
        return entranceFee;
    }

    public TypeOfLandmarks getTypeOf() {
        return typeOf;
    }

    public void setEntranceFee(int entranceFee) {
        this.entranceFee = entranceFee;
    }
}
