import models.Bus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BusTest {

    Bus bus;
    @BeforeEach
    void setUp(){
        bus = new Bus("My models.Bus", 4, 300, 8000, 20);
    }

    @Test
    void testRefuel(){
        bus.refuel(10);
        assertThat(bus.getCurrentFuel()).isEqualTo(10);
    }

    @Test
    void testDriveNoParams(){
        bus.refuel(10);
        bus.drive();
        assertThat(bus.getCurrentFuel()).isEqualTo(0);
    }

    @Test
    void testDriveWithDistanceParams(){
        bus.refuel(20);
        bus.drive(10);
        assertThat(bus.getCurrentFuel()).isEqualTo(10);
    }

    @Test
    void testGetCurrentFuel(){
        bus.refuel(50);
        assertThat(bus.getCurrentFuel()).isEqualTo(50);
    }

    @Test
    void testPickUpPassengers(){
        bus.pickUpPassengers(10);
        assertThat(bus.getCurrentCapacity()).isEqualTo(10);
    }

    @Test
    void dropOffPassengers(){
        bus.pickUpPassengers(11);
        bus.dropPassengers(6);
        assertThat(bus.getCurrentCapacity()).isEqualTo(5);
    }

    @Test
    void testUpgrade(){
        bus.upgrade();
        assertThat(bus.getValue()).isEqualTo(8050);
    }
}
