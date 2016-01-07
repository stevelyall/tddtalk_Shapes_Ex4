import org.junit.Test;

import static junit.framework.TestCase.*;

public class SquareTest {

    Square square;

    @Test
    public void testGetPerimeterCalculatesPerimeterCorrectly() {
        square = new Square(2);

        int perimeter = square.getPerimeter();
        assertEquals(8, perimeter);
    }

    @Test
    public void testGetAreaCalculatesAreaCorrectly() {
        square = new Square(4);

        int area = square.getArea();
        assertEquals(16, area);
    }
}
