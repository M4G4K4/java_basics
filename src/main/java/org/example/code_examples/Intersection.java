package org.example.code_examples;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {

        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[]{3,4,5,1};


        int[] results = intersection(nums1, nums2);

        for (int num: results){
            System.out.println(num);
        }

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        final Set<Integer> set = new HashSet<>();

        for (int j : nums1) {
            for (int k : nums2) {
                if (j == k) {
                    set.add(j);
                }
            }
        }

        return set.stream().mapToInt(Number::intValue).toArray();
    }
}
