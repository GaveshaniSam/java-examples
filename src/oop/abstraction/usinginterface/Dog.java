package oop.abstraction.usinginterface;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Baw waw");
    }

    @Override
    public void walkingMethod() {
        System.out.println("Run");
    }
}
