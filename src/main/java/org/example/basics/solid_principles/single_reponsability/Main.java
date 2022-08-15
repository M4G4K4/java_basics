package org.example.basics.solid_principles.single_reponsability;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);

        int sum = areaCalculator.sum(List.of(circle, square));
        System.out.println(sum);

        ShapesPrinter printer = new ShapesPrinter();
        System.out.println(printer.csv(sum));
        System.out.printf(printer.json(sum));
    }
}
