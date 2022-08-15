package org.example.basics.generic;

public abstract class Animal {
    private final String name;

    public Animal(final String name){
        this.name = name;
    }

    public String makeSound() {
        return "NOTHING";
    }

    public void eat(){
        System.out.println("Eating");
    }

    public String toString(){
        return this.name;
    }
}
