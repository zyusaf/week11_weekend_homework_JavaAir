import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeModelType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneModel());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(10, plane.getPlaneCapacity());
    }

    @Test
    public void planeHasMaxWeight(){
        assertEquals(500.00, plane.getPlaneMaxWeight(), 0.01);
    }
}
