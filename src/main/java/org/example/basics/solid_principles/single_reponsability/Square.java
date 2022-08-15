package org.example.basics.solid_principles.single_reponsability;

public class Square {
    private final int length;

    public Square(int radius) {
        this.length = radius;
    }

    public int getLength() {
        return length;
    }
}
