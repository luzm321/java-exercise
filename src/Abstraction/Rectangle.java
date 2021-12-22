package Abstraction;

// Rectangle class inheriting from the Shape abstract class needs to also be abstract if it is implementing at least
// one of the abstract methods in Shape parent class and can add abstract non-access modifier or can implement without
// adding the abstract modifier, can right click, generate and choose method implementation:
public class Rectangle extends Shape {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
