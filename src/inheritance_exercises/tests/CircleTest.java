package inheritance_exercises.tests;

import inheritance_exercises.Circle;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void getRadius() {
        Circle circle = new Circle(5.12, 53.12, 12.1);
        assertEquals(12.1, circle.getRadius(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setRadiusValid() {
        Circle circle = new Circle(5.12, 53.12, 12.1);
        circle.setRadius(123.123);
        assertEquals(123.123, circle.getRadius(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setRadiusInvalid() {
        Circle circle = new Circle(5.12, 53.12, 12.1);
        circle.setRadius(-132);
        assertEquals(12.1, circle.getRadius(), AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void getArea() {
        Circle circle = new Circle(5.12, 53.12, 12.1);
        assertEquals(459.960581, circle.getArea(), AllTests.DOUBLE_TOLERANCE);
    }
}