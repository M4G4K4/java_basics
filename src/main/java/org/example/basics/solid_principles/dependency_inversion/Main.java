package org.example.basics.solid_principles.dependency_inversion;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculator2 = new AreaCalculatorV2();

        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(10);
        Rectangule rectangule = new Rectangule(20);

        List<Shape> shapes = List.of(circle, square, cube, rectangule);


        ShapesPrinter printer = new ShapesPrinter(areaCalculator);

        System.out.println(printer.csv2(shapes));
        System.out.printf(printer.json2(shapes));

        /**
         * This uses the principle of interface segregation
         *
         * This principle makes also that complies with open-close principle
         */
        // ShapesPrinter just receives the Interface and the method used will be of the implementation
        ShapesPrinter printer2 = new ShapesPrinter(areaCalculator2);
        System.out.println(printer2.csv2(shapes));
        System.out.printf(printer2.json2(shapes));

    }
}
