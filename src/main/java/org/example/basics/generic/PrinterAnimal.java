package org.example.basics.generic;

                            // T extends Animal & can implment another class (Serializable)
public class PrinterAnimal <T extends Animal>{
    T thingToPrint;

    public PrinterAnimal(final T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        thingToPrint.eat();
        thingToPrint.makeSound();
        System.out.println(thingToPrint);
    }

}
