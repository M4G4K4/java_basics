package org.example.basics.inheritance;

public class Main {
    public static void main(String[] args) {

        final String type = Animal.type;

        Animal cat = new Cat("ruffa");
        Cat cat2 = new Cat("Tekko");

        System.out.println(cat.makeSound());
        System.out.println(cat2.makeSound());

        cat.printName();


        Dog dog  = new Puppy("Leti");
        Puppy puppy  = new Puppy("Leti");

        System.out.println(dog.makeSound());
        System.out.println(puppy.makeSound());
    }

}
