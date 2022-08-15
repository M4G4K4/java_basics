package org.example.basics.solid_principles.dependency_inversion;

public class Rectangule implements Shape {
    private final int length;

    public Rectangule(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return length * length;
    }
}
