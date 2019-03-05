package inheritance_exercises.tests;

import inheritance_exercises.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getHeight() {
        Rectangle rectangle = new Rectangle(123.123, 123.123, 52.12, 87.12);
        assertEquals(52.12, rectangle.getHeight(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setHeightValid() {
        Rectangle rectangle = new Rectangle(123.123, 123.123, 52.12, 87.12);
        rectangle.setHeight(12.12);
        assertEquals(12.12, rectangle.getHeight(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setHeightInvalid() {
        Rectangle rectangle = new Rectangle(123.123, 123.123, 52.12, 87.12);
        rectangle.setHeight(-12.01);
        assertEquals(52.12, rectangle.getHeight(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void getLength() {
        Rectangle rectangle = new Rectangle(123.123, 123.123, 52.12, 87.12);
        assertEquals(87.12, rectangle.getLength(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setLengthValid() {
        Rectangle rectangle = new Rectangle(123.123, 123.123, 52.12, 87.12);
        rectangle.setLength(12.12);
        assertEquals(12.12, rectangle.getLength(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setLengthInvalid() {
        Rectangle rectangle = new Rectangle(123.123, 123.123, 52.12, 87.12);
        rectangle.setLength(-1.2);
        assertEquals(87.12, rectangle.getLength(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void getArea() {
        Rectangle rectangle = new Rectangle(123.123, 123.123, 52.12, 87.12);
        assertEquals(4540.6944, rectangle.getArea(), AllTests.DOUBLE_TOLERANCE);
    }
}