package inheritance_exercises.tests;

import org.junit.Test;

import static org.junit.Assert.*;

public class EquilateralTriangleTest {

    @Test
    public void testConstructor() {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(12.5, 12.35, 53.12);
        assertEquals(53.12, equilateralTriangle.getBase(),  AllTests.DOUBLE_TOLERANCE);
        assertEquals(46.0032694, equilateralTriangle.getHeight(),  AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setBase() {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(12.5, 12.35, 53.12);
        equilateralTriangle.setBase(12.12);
        assertEquals(12.12, equilateralTriangle.getBase(),  AllTests.DOUBLE_TOLERANCE);
        assertEquals(10.4962279, equilateralTriangle.getHeight(),  AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void setHeight() {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(12.5, 12.35, 53.12);
        equilateralTriangle.setHeight(5.3);
        assertEquals(6.11991285, equilateralTriangle.getBase(),  AllTests.DOUBLE_TOLERANCE);
        assertEquals(5.3, equilateralTriangle.getHeight(),  AllTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void getArea() {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(12.5, 12.35, 23);
        assertEquals(229.063719, equilateralTriangle.getArea(),  AllTests.DOUBLE_TOLERANCE);
    }
}