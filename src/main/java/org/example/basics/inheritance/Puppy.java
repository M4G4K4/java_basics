package org.example.basics.inheritance;

public class Puppy extends Dog{
    public Puppy(String name) {
        super(name);
    }


    public String makeSound() {
        return "Ai ai";
    }
}
