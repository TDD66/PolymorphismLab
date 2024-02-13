package models;

import java.util.ArrayList;

public class Garage {
    private ArrayList<LandVehicle> landVehicles;

    public Garage(){
        this.landVehicles = new ArrayList<>();
    }

    public int countVehicles(){
        return this.landVehicles.size();
    }

    public int calculateTotalValue(){
        int total = 0;
        for(LandVehicle landVehicle : landVehicles){
            total += landVehicle.getValue();
        }
        return total;
    }

    public void addVehicle(LandVehicle landVehicle){
        this.landVehicles.add(landVehicle);
    }

    public ArrayList<LandVehicle> getVehicles(){
        return this.landVehicles;
    }
}
