package inheritance_exercises.tests;

import inheritance_exercises.Ellipse;
import org.junit.Test;

import static org.junit.Assert.*;

public class EllipseTest {

    @Test
    public void getArea() {
        Ellipse ellipse = new Ellipse(12.12, 12.12, 25.1, 12.1);
        assertEquals(238.533272, ellipse.getArea(), AllTests.DOUBLE_TOLERANCE);
    }
}