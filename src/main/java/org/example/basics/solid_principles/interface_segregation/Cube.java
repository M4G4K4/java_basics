package org.example.basics.solid_principles.interface_segregation;

public class Cube implements Shape, ThreeDimensionalShape {
    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return length * length * length;
    }


    @Override
    public double volume() {
        return 0;
    }
}
