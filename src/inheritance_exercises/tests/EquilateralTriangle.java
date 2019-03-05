package inheritance_exercises.tests;

import inheritance_exercises.Triangle;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double xPos, double yPos, double base) {
        super(xPos, yPos, base, Math.sqrt(Math.pow(base, 2) - Math.pow((base/2), 2)));
    }

    @Override
    public void setBase(double base) {
        super.setBase(base);
        super.setHeight(Math.sqrt(Math.pow(base, 2) - Math.pow((base/2), 2)));

    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setBase(Math.sqrt(4*Math.pow(height, 2)/3));
    }
}
