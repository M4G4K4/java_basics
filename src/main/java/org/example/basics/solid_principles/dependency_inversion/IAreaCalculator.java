package org.example.basics.solid_principles.dependency_inversion;

import java.util.List;

public interface IAreaCalculator {
    int sum(List<Shape> shapes);
}
