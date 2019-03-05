package inheritance_exercises;

import java.awt.*;

public class Shape {

    protected double xPos;
    protected double yPos;
    protected Color colour;

    public Shape(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public double getXPosition() {
        return xPos;
    }

    public double getYPosition() {
        return yPos;
    }

    public Color getColour() {
        return colour;
    }

    public double getArea() {
        return 0;
    }
}
