package oop.abstraction.abstractclass;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Baw waw");
    }

    @Override
    public void walkingMethod() {
        System.out.println("Run");
    }
}
