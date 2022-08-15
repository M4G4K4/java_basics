package org.example.basics.solid_principles.open_closed;

public class ShapesPrinter {

    public String json(int sum){
        return "{sum: %s}".formatted(sum);
    }

    public String csv(int sum){
        return "sum,%s".formatted(sum);
    }
}
