package org.example.basics.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IntegerToPrint integerToPrint = new IntegerToPrint(1);
        integerToPrint.print();

        DoubleToPrint doubleToPrint = new DoubleToPrint(2.2);
        doubleToPrint.print();


        // Generic class to do what the above do but as generic
        Printer<Integer> printer = new Printer<>(20);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(6.7);
        doublePrinter.print();

        // Generic class but that extends abstract class animal
        PrinterAnimal<Cat> printerCat = new PrinterAnimal<>(new Cat("Ruffa"));
        printerCat.print();


        // Functions with generic
        GenericUtility genericUtility = new GenericUtility();
        genericUtility.doStuff("Cenas");
        genericUtility.doStuff2("Cenas");



        Cat cat = new GenericUtility().doStuff3("ruffa");
        System.out.printf(cat.makeSound());


        List<Integer> list = new ArrayList<>();
        list.add(2);

        printList(list);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("tekko"));
        printList2(catList);
    }

    private static void printList(List<?> list){
        System.out.println(list);
    }

    private static void printList2(List<? extends Animal> list){
        System.out.println(list);
    }
}
