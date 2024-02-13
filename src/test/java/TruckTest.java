import models.Truck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TruckTest {

    Truck truck;

    @BeforeEach
    void setUp(){
        truck = new Truck("My models.Truck", 20, 600, 12000, 6000);
    }

    @Test
    void testLoad(){
        truck.load(500);
        assertThat(truck.getCurrentCargo()).isEqualTo(500);
    }
    @Test
    void testUnload(){
        truck.load(1000);
        truck.unload();
        assertThat(truck.getCurrentCargo()).isZero();
    }

    @Test
    void testUpgrade(){
        truck.upgrade();
        assertThat(truck.getValue()).isEqualTo(12100);
    }


}
