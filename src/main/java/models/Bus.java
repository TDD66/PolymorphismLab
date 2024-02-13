package models;

public class Bus extends LandVehicle {
    private final int MAX_CAPACITY;
    private int currentCapacity;

    public Bus(String name, int numberOfWheels, int MAX_FUEL, int value, int MAX_CAPACITY){
        super(name, numberOfWheels, MAX_FUEL, value);
        this.MAX_CAPACITY = MAX_CAPACITY;
        this.currentCapacity = 0;
    }

    public void dropPassengers(int droppedPassengers){
        if(this.currentCapacity - droppedPassengers < 0){
            return;
        }
        this.currentCapacity -= droppedPassengers;
    }

    public void pickUpPassengers(int newPassengers){
        if(newPassengers <= 0){
            return;
        }
        this.currentCapacity = Math.min(this. MAX_CAPACITY, this.currentCapacity + newPassengers);
    }

    @Override
    public void upgrade(){
        this.value += 50;
    }
    public int getCurrentCapacity() {
        return currentCapacity;
    }
}
