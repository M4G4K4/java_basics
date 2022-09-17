package org.example.code_examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindThirdSmallestNumber {
    public static void main(String[] args) {
        System.out.println(thirdSmallest(new HashSet<>(Set.of(5, 7, 1, 2, 10, 345, 123))));
        System.out.println(thirdSmallest2(new HashSet<>(Set.of(5, 7, 1, 2, 10, 345, 123))));
    }

    public static int thirdSmallest(final Set<Integer> numbers) {
        if (numbers.size() < 3) {
            return 0;
        }

        TreeSet<Integer> set = new TreeSet<>(numbers);
        Integer[] arr = new Integer[numbers.size()];
        set.toArray(arr);
        return arr[2];
    }

    public static int thirdSmallest2(final Set<Integer> numbers) {
        if (numbers.size() < 3) {
            return 0;
        }
        Integer[] arr = new Integer[numbers.size()];
        numbers.toArray(arr);
        Arrays.sort(arr);
        return arr[2];
    }
}
