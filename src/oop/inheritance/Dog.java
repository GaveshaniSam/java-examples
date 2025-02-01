package oop.inheritance;

public class Dog extends Animal {
    public static void loyalty() {
        System.out.println("Loyal");
    }

    public static void main(String[] args) {
        loyalty();
        Dog rex = new Dog();
        rex.sound();
    }
}
