import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest {

    Garage garage;
    Vehicle car;
    Vehicle bus;

    @BeforeEach
    void setUp(){
        garage = new Garage();
//        Truck = new Truck("My Truck", 18, 100, 2100, 1000);
        bus = new Bus("My Bus", 4, 300, 8000, 20);
    }

    @Test
    void testAddVehicle(){
        garage.addVehicle(car);
        assertThat(garage.getVehicles().contains(car)).isTrue();
    }
    @Test
    void testCountVehicles(){
        garage.addVehicle(car);
        garage.addVehicle(bus);
        assertThat(garage.countVehicles()).isEqualTo(2);
    }

    @Test
    void testCalculateTotalValue(){
        garage.addVehicle(car);
        garage.addVehicle(bus);
        assertThat(garage.calculateTotalValue()).isEqualTo(10100);
    }
}
