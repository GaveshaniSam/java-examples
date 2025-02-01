package oop.abstraction.abstractclass;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void walkingMethod() {
        System.out.println("Climb");
    }
}
