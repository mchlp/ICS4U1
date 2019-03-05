package inheritance_exercises;

public class Ellipse extends Rectangle {
    public Ellipse(double xPos, double yPos, double height, double length) {
        super(xPos, yPos, height, length);
    }

    @Override
    public double getArea() {
        return (Math.PI * (this.height/2) * (this.length/2));
    }
}
