package org.example.basics.generic;

// Dont use, dont use generics
public class IntegerToPrint {
    private Integer thingToPrint;

    public IntegerToPrint(final Integer thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
