package org.example.code_examples;

import java.util.ArrayList;
import java.util.List;

public class Arrays2D_DS {

    public static void main(String[] args) {
        /**
         * HourGlass array
         *
         *  1 1 1 0 0 0
         *  0 1 0 0 0 0
         *  1 1 1 0 0 0
         *  0 0 2 4 4 0
         *  0 0 0 2 0 0
         *  0 0 1 2 4 0
         *
         *  example:
         *  1 1 1
         *    1
         *  1 1 1
         *
         *  1 1 0
         *    0
         *  1 1 0
         */


        final List<List<Integer>> list1 = new ArrayList<>();
        list1.add(List.of(1, 1, 1, 0, 0, 0));
        list1.add(List.of(0, 1, 0, 0, 0, 0));
        list1.add(List.of(1, 1, 1, 0, 0, 0));
        list1.add(List.of(0, 0, 2, 4, 4, 0));
        list1.add(List.of(0, 0, 0, 2, 0, 0));
        list1.add(List.of(0, 0, 1, 2, 4, 0));

        System.out.println(hourglassSum(list1));

    }

    public static int hourglassSum(final List<List<Integer >> arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(0).size() - 2; j++) {
                int count = 0;
                count = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) +
                        arr.get(i + 1).get(j + 1) +
                        arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                if (count > max) {
                    max = count;
                }
            }
        }


        return max;
    }
}
