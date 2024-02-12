import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    Vehicle vehicle;
    @BeforeEach
    void setUp(){
        vehicle = new Vehicle("Car", 4, 100, 5000);
    }

    @Test
    void testRefuel(){
        vehicle.refuel(10);
        assertThat(vehicle.getCurrentFuel()).isEqualTo(10);
    }

    @Test
    void testDriveNoParams(){
        vehicle.refuel(20);
        vehicle.drive();
        assertThat(vehicle.getCurrentFuel()).isEqualTo(0);
    }
    @Test
    void testDriveWithDistanceParam(){
        vehicle.refuel(20);
        vehicle.drive(15);
        assertThat(vehicle.getCurrentFuel()).isEqualTo(5);
    }
}
