import models.Plane;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlaneTest {

    Plane plane;

    @BeforeEach
    void setUp(){
        plane = new Plane(4, 800);
    }

    @Test
    void testUpgrade(){
        plane.upgrade();
        assertThat(plane.getValue()).isEqualTo(1000);
    }
}
