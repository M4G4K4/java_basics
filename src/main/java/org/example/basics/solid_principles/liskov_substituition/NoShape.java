package org.example.basics.solid_principles.liskov_substituition;

public class NoShape implements Shape {
    @Override
    public double area() {
       throw new IllegalStateException("Cannot calculate area");
    }
}
