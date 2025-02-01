package oop.abstraction.usinginterface;

public class Test {
    public static void main(String[] args) {
        Animal kitty = new Cat();
        kitty.sound();
        kitty.walkingMethod();

        Animal rex = new Dog();
        rex.sound();
        rex.walkingMethod();
    }
}
