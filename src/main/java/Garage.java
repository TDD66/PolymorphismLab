import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> vehicles;

    public Garage(){
        this.vehicles = new ArrayList<>();
    }

    public int countVehicles(){
        return this.vehicles.size();
    }

    public int calculateTotalValue(){
        int total = 0;
        for(Vehicle vehicle : vehicles){
            total += vehicle.getVALUE();
        }
        return total;
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles(){
        return this.vehicles;
    }
}
