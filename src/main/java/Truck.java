public class Truck extends Vehicle{

    private final int MAX_CARGO;
    private int currentCargo;

    public Truck(String name, int numberOfWheels, int MAX_FUEL, int VALUE, int MAX_CARGO){
        super(name, numberOfWheels, MAX_FUEL, VALUE);
        this.MAX_CARGO = MAX_CARGO;
        this.currentCargo = 0;
    }

    public void unload(){
        this.currentCargo = 0;
    }

    public void load(int newCargo){
        if(newCargo <= 0){
            return;
        }
        this.currentCargo = Math.min(MAX_CARGO, this.currentCargo + newCargo);
    }

    public int getCurrentCargo() {
        return currentCargo;
    }
}
