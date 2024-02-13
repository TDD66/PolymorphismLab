package models;

import interfaces.IIncreaseValue;

public class Plane implements IIncreaseValue {
    private int engines;
    private int value;

    public Plane(int engines, int value){
        this.engines = engines;
        this.value = value;
    }

    @Override
    public void upgrade() {
        this.value += 200;
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
