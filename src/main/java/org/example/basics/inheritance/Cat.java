package org.example.basics.inheritance;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Miau";
    }

}
