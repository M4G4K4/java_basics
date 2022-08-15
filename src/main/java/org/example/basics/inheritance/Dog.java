package org.example.basics.inheritance;

import org.example.basics.generic.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Au au";
    }
}
