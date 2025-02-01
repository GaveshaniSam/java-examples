package oop.polymorphism;

import oop.inheritance.Animal;

public class Cat extends Animal {
    public void sound() {
        System.out.println("Meow");
    }

    public void mood(String moodType) {
        System.out.println("Cat is " + moodType);
    }

    public void mood(String moodType, boolean hasEaten) {
        System.out.println("Cat is " + moodType + ". Has eaten? " + hasEaten);
    }

    public static void main(String[] args) {
        Cat kitty = new Cat();
        kitty.sound();
//        super.sound(); This will call parent class sound method
        kitty.mood("Angry");
        kitty.mood("Sleepy", true);
    }
}
