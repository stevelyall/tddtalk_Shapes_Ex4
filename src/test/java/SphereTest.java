import org.junit.Test;

import static junit.framework.TestCase.*;

public class SphereTest {

   Sphere sphere;

    @Test
    public void testGetPerimeterCalculatesPerimeterCorrectly() {
        sphere = new Sphere(2);

        double area = sphere.getArea();

        assertEquals(50.27, Math.round(area*100.0)/100.0);
    }
}
