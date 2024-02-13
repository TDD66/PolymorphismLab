package models;

import interfaces.IIncreaseValue;

public abstract class LandVehicle implements IIncreaseValue {
    private final String NAME;
    private final int NUMBER_OF_WHEELS;
    private final int MAX_FUEL;
    private int currentFuel;
    protected int value;

    public LandVehicle(String NAME, int NUMBER_OF_WHEELS, int MAX_FUEL, int value){
        this.NAME = NAME;
        this.NUMBER_OF_WHEELS = NUMBER_OF_WHEELS;
        this.MAX_FUEL = MAX_FUEL;
        this.value = value;
        this.currentFuel = 0;
    }

    public void refuel(int addFuel){
        if(addFuel <= 0){
            return;
        }
        this.currentFuel = Math.min(this.currentFuel + addFuel, this.MAX_FUEL);
    }

    public void drive(){
        this.currentFuel = 0;
    }

    public void drive(int distance){
        if(distance < 0 || distance > this.currentFuel){
            return;
        }
        this.currentFuel -= distance;
    }

    @Override
    public abstract void upgrade();

    public int getCurrentFuel() {
        return currentFuel;
    }

    public int getValue(){
        return this.value;
    }
}
