package oop.abstraction.usinginterface;

public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void walkingMethod() {
        System.out.println("Climb");

    }
}
