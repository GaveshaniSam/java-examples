package oop.abstraction.shapes;

public class Rectangle implements Shape{
    @Override
    public double getArea(double length, double width) {
        return length * width;
    }
}
