package inheritance_exercises.tests;

import inheritance_exercises.Square;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void setSizeValid() {
        Square square = new Square(12.123, 52.12, 12.12);
        square.setSize(25.15);
        assertEquals(25.15, square.getSize(), AllTests.DOUBLE_TOLERANCE);
        assertEquals(25.15, square.getHeight(), AllTests.DOUBLE_TOLERANCE);
        assertEquals(25.15, square.getLength(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setSizeInvalid() {
        Square square = new Square(12.123, 52.12, 12.12);
        square.setSize(-25.15);
        assertEquals(12.12, square.getSize(), AllTests.DOUBLE_TOLERANCE);
        assertEquals(12.12, square.getHeight(), AllTests.DOUBLE_TOLERANCE);
        assertEquals(12.12, square.getLength(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setHeight() {
        Square square = new Square(12.123, 52.12, 12.12);
        square.setHeight(25.15);
        assertEquals(25.15, square.getSize(), AllTests.DOUBLE_TOLERANCE);
        assertEquals(25.15, square.getHeight(), AllTests.DOUBLE_TOLERANCE);
        assertEquals(25.15, square.getLength(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setWidth() {
        Square square = new Square(12.123, 52.12, 12.12);
        square.setLength(25.54);
        assertEquals(25.54, square.getSize(), AllTests.DOUBLE_TOLERANCE);
        assertEquals(25.54, square.getHeight(), AllTests.DOUBLE_TOLERANCE);
        assertEquals(25.54, square.getLength(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void getSize() {
        Square square = new Square(12.123, 52.12, 12.12);
        assertEquals(12.12, square.getSize(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void sizeSameAsHeightAndLength() {
        Square square = new Square(12.123, 52.12, 12.12);
        assertEquals(12.12, square.getSize(), AllTests.DOUBLE_TOLERANCE);
        assertEquals(12.12, square.getHeight(), AllTests.DOUBLE_TOLERANCE);
        assertEquals(12.12, square.getLength(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void getArea() {
        Square square = new Square(12.123, 52.12, 12.12);
        assertEquals(146.8944, square.getArea(), AllTests.DOUBLE_TOLERANCE);
    }
}