package org.example.basics.inheritance;

public class Dolphin extends Animal{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return null;
    }
}
