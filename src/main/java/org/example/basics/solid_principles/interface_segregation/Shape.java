package org.example.basics.solid_principles.interface_segregation;

public interface Shape {
    double area();

    /**
     * This breack the interface segregation principle , because is forcing a client of this interface to implements
     * methods that can´t do
     * The circle can't implement the volume only the cubes can
     *
     * So it needs to seperate this interface into smaller one
     *
     */
    // double volume();
}
