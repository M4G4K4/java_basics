package org.example.basics.record;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Pedro", 2);
        System.out.println(person);

        PersonRecord personRecord = new PersonRecord("Leticia", 3);
        System.out.println(personRecord);

        System.out.println("#####");


        // This object , Person , as methods to use the hashcode and equals ,
        // is why it says they are equal
        Person person2 = new Person("Pedro", 2);
        Person person3 = new Person("Pedro", 2);
        System.out.println(person2 == person3); // False
        System.out.println(person2.hashCode() == person3.hashCode()); // True
        System.out.println(person2.equals(person3)); // True
        System.out.println(Objects.equals(person2, person3)); // True

        System.out.println("#####");

        Animal animal = new Animal("Pedro", "Male");
        Animal animal2 = new Animal("Pedro", "Male");
        System.out.println(animal == animal2); // False
        System.out.println(animal.hashCode() == animal2.hashCode()); // False
        System.out.println(animal.equals(animal2)); // False
        System.out.println(Objects.equals(animal, animal2)); // False

    }
}
