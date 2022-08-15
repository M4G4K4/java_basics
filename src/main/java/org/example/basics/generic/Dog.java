package org.example.basics.generic;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Ufff";
    }
}
