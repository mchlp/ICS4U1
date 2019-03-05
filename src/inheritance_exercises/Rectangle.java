package inheritance_exercises;

public class Rectangle extends Shape {

    protected double height;
    protected double length;

    public Rectangle(double xPos, double yPos, double height, double length) {
        super(xPos, yPos);
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    @Override
    public double getArea() {
        return this.length * this.height;
    }
}

