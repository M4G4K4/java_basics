package org.example.code_examples;

import java.util.ArrayList;
import java.util.List;

public class ArraysLeftRotation {
    public static void main(String[] args) {

        final List<Integer> list = new ArrayList<>(List.of(2,6,12,5,9,9));
        System.out.println(rotateLeft(list, 3));

    }
    // NOT working
    public static List<Integer> rotateLeft(final List<Integer> a, int d) {
        final List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            a.set(i, (i + d) % a.size());
        }

        return a;
    }
}

