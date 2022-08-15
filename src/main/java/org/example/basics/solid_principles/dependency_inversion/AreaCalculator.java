package org.example.basics.solid_principles.dependency_inversion;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {

    @Override
    public int sum(final List<Shape> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            sum += shape.area();
        }
        return sum;
    }


}
