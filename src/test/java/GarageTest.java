import models.Bus;
import models.Garage;
import models.LandVehicle;
import models.Truck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest {

    Garage garage;
    LandVehicle truck;
    LandVehicle bus;

    @BeforeEach
    void setUp(){
        garage = new Garage();
        truck = new Truck("My models.Truck", 18, 100, 2100, 1000);
        bus = new Bus("My models.Bus", 4, 300, 8000, 20);
    }

    @Test
    void testAddVehicle(){
        garage.addVehicle(truck);
        assertThat(garage.getVehicles().contains(truck)).isTrue();
    }
    @Test
    void testCountVehicles(){
        garage.addVehicle(truck);
        garage.addVehicle(bus);
        assertThat(garage.countVehicles()).isEqualTo(2);
    }

    @Test
    void testCalculateTotalValue(){
        garage.addVehicle(truck);
        garage.addVehicle(bus);
        assertThat(garage.calculateTotalValue()).isEqualTo(10100);
    }
}
