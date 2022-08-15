package org.example.basics.polymorphisms;

public class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public void eat(){
        System.out.println("Hmmmmm");
    }


    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Animal setColor(String color) {
        this.color = color;
        return this;
    }
}
