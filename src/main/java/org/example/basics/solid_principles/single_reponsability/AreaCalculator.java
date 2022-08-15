package org.example.basics.solid_principles.single_reponsability;

import java.util.List;

public class AreaCalculator {

    public int sum(final List<Object> shapes){
        int sum = 0;
        for(int i = 0; i < shapes.size(); i++){
            Object shape = shapes.get(i);

            if(shape instanceof Square){
                sum += Math.pow(((Square) shape).getLength(), 2);
            }
            if(shape instanceof Circle){
                sum+= Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
            /** This if statments breacks the open-closed principle since every time a new shape comes this class need to be
            * changed
            */
        }
        return sum;
    }

    /**
     * This breaks the principle of Single responsibility
     * Since the class is calculating the area but also transforming the data to whatever it needs
     * To fix it we use the ShapesPrinter, that he's responsibility is just to print / transform the data.
     */
    /*
    public String json(int sum){
        return "{sum: %s}".formatted(sum);
    }

    public String csv(int sum){
        return "sum,%s".formatted(sum);
    }

     */
}
