package org.example.basics.solid_principles.interface_segregation;

public class NoShape implements Shape {
    @Override
    public double area() {
       throw new IllegalStateException("Cannot calculate area");
    }
}
