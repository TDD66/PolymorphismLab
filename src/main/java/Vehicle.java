public class Vehicle {
    private String name;
    private int numberOfWheels;
    private final int MAX_FUEL;
    private int currentFuel;
    private final int VALUE;

    public Vehicle(String name, int numberOfWheels, int MAX_FUEL, int VALUE){
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.MAX_FUEL = MAX_FUEL;
        this.VALUE = VALUE;
        this.currentFuel = 0;
    }

    public void refuel(int addFuel){
        if(addFuel <= 0){
            return;
        }
        this.currentFuel = Math.min(this.currentFuel + addFuel, this.MAX_FUEL);
    }

    public void drive(int distance){
        if(distance < 0 || distance > this.currentFuel){
            return;
        }
        this.currentFuel -= distance;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }
}
