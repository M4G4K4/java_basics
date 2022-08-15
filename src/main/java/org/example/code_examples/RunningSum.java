package org.example.code_examples;

/**
 * Leet Code problem.
 *
 * 1480. Running sum of 1d Array
 *
 */

public class RunningSum {


    public static void main(String[] args) {

    }

    public static int[] runningSum(int[] nums) {
        final int[] result = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
