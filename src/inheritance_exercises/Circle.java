package inheritance_exercises;

public class Circle extends Shape {

    protected double radius;

    public Circle(double xPos, double yPos, double radius) {
        super(xPos, yPos);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
