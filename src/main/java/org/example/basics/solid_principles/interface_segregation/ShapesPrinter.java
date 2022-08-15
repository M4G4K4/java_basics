package org.example.basics.solid_principles.interface_segregation;

public class ShapesPrinter {

    public String json(int sum){
        return "{sum: %s}".formatted(sum);
    }

    public String csv(int sum){
        return "sum,%s".formatted(sum);
    }
}
