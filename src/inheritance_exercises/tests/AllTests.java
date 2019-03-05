package inheritance_exercises.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CircleTest.class,
        ShapeTest.class,
        TriangleTest.class,
        RectangleTest.class,
        SquareTest.class,
        EllipseTest.class,
        EquilateralTriangleTest.class
})

public class AllTests {
    public static final double DOUBLE_TOLERANCE = 0.0001;
}
