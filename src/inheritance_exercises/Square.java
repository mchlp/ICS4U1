package inheritance_exercises;

public class Square extends Rectangle {
    public Square(double xPos, double yPos, double size) {
        super(xPos, yPos, size, size);
    }

    public void setSize(double size) {
        if (size > 0) {
            this.height = size;
            this.length = size;
        }
    }

    public double getSize() {
        return this.height;
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setLength(height);
    }

    @Override
    public void setLength(double length) {
        super.setHeight(length);
        super.setLength(length);
    }
}
