package models;

import interfaces.IIncreaseValue;

import java.util.ArrayList;

public class Garage {
    private ArrayList<IIncreaseValue> vehicles;

    public Garage(){
        this.vehicles = new ArrayList<>();
    }

    public int countVehicles(){
        return this.vehicles.size();
    }

    public int calculateTotalValue(){
        int total = 0;
        for(IIncreaseValue vehicle : vehicles){
            total += vehicle.getValue();
        }
        return total;
    }

    public void addVehicle(IIncreaseValue vehicle){
        this.vehicles.add(vehicle);
    }

    public ArrayList<IIncreaseValue> getVehicles(){
        return this.vehicles;
    }
}
