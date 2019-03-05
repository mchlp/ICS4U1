package inheritance_exercises;

public class Triangle extends Shape {

    protected double base;
    protected double height;

    public Triangle(double xPos, double yPos, double base, double height) {
        super(xPos, yPos);
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (this.base * this.height) / 2;
    }
}
