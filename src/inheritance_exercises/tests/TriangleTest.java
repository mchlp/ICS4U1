package inheritance_exercises.tests;

import inheritance_exercises.Triangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void setBaseValid() {
        Triangle triangle = new Triangle(123.123, 123.123, 12.5, 10.5);
        triangle.setBase(15.5);
        assertEquals(15.5, triangle.getBase(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setBaseInvalid() {
        Triangle triangle = new Triangle(123.123, 123.123, 12.5, 10.5);
        triangle.setBase(-15.5);
        assertEquals(12.5, triangle.getBase(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setHeightValid() {
        Triangle triangle = new Triangle(123.123, 123.123, 12.5, 10.5);
        triangle.setHeight(17.5);
        assertEquals(17.5, triangle.getHeight(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setHeightInvalid() {
        Triangle triangle = new Triangle(123.123, 123.123, 12.5, 10.5);
        triangle.setHeight(-15.5);
        assertEquals(10.5, triangle.getHeight(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void getBase() {
        Triangle triangle = new Triangle(123.123, 123.123, 12.5, 10.5);
        assertEquals(12.5, triangle.getBase(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void getHeight() {
        Triangle triangle = new Triangle(123.123, 123.123, 12.5, 10.5);
        assertEquals(10.5, triangle.getHeight(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void getArea() {
        Triangle triangle = new Triangle(123.123, 123.123, 12.5, 10.5);
        assertEquals(65.62500, triangle.getArea(), AllTests.DOUBLE_TOLERANCE);
    }
}