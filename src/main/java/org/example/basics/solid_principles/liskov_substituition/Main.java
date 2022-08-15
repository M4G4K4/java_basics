package org.example.basics.solid_principles.liskov_substituition;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(10);
        Rectangule rectangule = new Rectangule(20);


        /**
         * Since the noShape is not substitute by the parent Shape , this way it broke the liskov substitution principle
         * Because NoShape cannot implement all methods of the Shape interface ,
         * Since it implements should be able to implement all without any problems.
         */
        NoShape noShape = new NoShape();
        Shape shape = new NoShape();

        int sum = areaCalculator.sum(List.of(circle, square, cube, rectangule, noShape));
        System.out.println(sum);

        ShapesPrinter printer = new ShapesPrinter();
        System.out.println(printer.csv(sum));
        System.out.printf(printer.json(sum));
    }
}
