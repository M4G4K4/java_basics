package org.example.basics.solid_principles.dependency_inversion;

import java.util.List;

public class ShapesPrinter {

    /**
     * Breaks dependency inversion
     */
    private final AreaCalculator areaCalculator = new AreaCalculator();

    private final IAreaCalculator areaCalculatorInterface;



    public ShapesPrinter(IAreaCalculator areaCalculatorInterface) {
        this.areaCalculatorInterface = areaCalculatorInterface;
    }

    /**
     * The code below break the principle of dependency inversion
     *
     * Depends on the concrete AreaCalculator
     *
     */
    public String json(List<Shape> shapes){
        return "{sum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes){
        return "sum,%s".formatted(areaCalculator.sum(shapes));
    }


    /**
     * To fix, now he depend on the interface , this way the sum method will depend in the class that implements the interface
     * and no modification needed to do here
     *
     */

    public String json2(List<Shape> shapes){
        return "{sum: %s}".formatted(areaCalculatorInterface.sum(shapes));
    }

    public String csv2(List<Shape> shapes){
        return "sum,%s".formatted(areaCalculatorInterface.sum(shapes));
    }
}
