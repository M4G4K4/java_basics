package org.example.basics.generic;

// Dont use, dont use generics
public class DoubleToPrint {
    private Double thingToPrint;

    public DoubleToPrint(final Double thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
