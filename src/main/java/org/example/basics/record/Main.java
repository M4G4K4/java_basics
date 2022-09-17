package org.example.basics.record;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Pedro", 2);
        System.out.println(person);

        PersonRecord personRecord = new PersonRecord("Leticia", 3);
        System.out.println(personRecord);
    }
}
