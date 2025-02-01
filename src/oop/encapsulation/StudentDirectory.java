package oop.encapsulation;

public class StudentDirectory {
    public static void main(String[] args) {
        Student kamal = new Student();
        kamal.setName("Kamal");
        kamal.setAge(20);
        System.out.println("Student name is " + kamal.getName());
        System.out.println("Student age is " + kamal.getAge());

        Student nethma = new Student();
        nethma.setName("Nethma");
        nethma.setAge(21);
        System.out.println("Student name is " + nethma.getName());
        System.out.println("Student age is " + nethma.getAge());
    }
}
