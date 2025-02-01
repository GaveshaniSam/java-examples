package oop.abstraction.shapes;

public class Test {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        System.out.println(rectangle.getArea(30, 20));

        Shape square = new Square();
        System.out.println(square.getArea(20, 20));
    }
}
