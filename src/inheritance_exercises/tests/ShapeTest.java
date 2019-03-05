package inheritance_exercises.tests;

import inheritance_exercises.Shape;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest {
    @Test
    public void getXPosition() {
        Shape shape = new Shape(123.123, 321.321);
        assertEquals(123.123, shape.getXPosition(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void getYPosition() {
        Shape shape = new Shape(123.123, 321.321);
        assertEquals(321.321, shape.getYPosition(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void getColour() {
        Shape shape = new Shape(123.123, 321.321);
        assertNull(shape.getColour());
    }

    @Test
    public void getArea() {
        Shape shape = new Shape(123.123, 321.321);
        assertEquals(0.0, shape.getArea(), AllTests.DOUBLE_TOLERANCE);
    }
}