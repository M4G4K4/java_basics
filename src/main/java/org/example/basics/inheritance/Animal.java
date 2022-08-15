package org.example.basics.inheritance;

public abstract class Animal {
    private final String name;

    public final static String type = "mamel";

    public Animal(final String name){
        this.name = name;
    }

    public abstract String makeSound();

    public String talk(){
        return "Talk";
    }

    public void printName(){
        System.out.println(name);
    }
}
