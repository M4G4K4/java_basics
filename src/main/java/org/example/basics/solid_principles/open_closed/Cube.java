package org.example.basics.solid_principles.open_closed;

public class Cube implements Shape{
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
}
