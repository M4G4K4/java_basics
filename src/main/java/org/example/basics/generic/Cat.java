package org.example.basics.generic;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Miau";
    }
}
