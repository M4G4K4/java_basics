package org.example.code_examples;

/**
 * LeetCode
 * <p>
 * 724. Find Pivot Index
 */

public class PivotIndex {
    public static void main(String[] args) {

    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;

        for (final int num : nums) {
            sum += num;
        }

        int left = 0;
        int right = sum;

        for (int i = 0; i < nums.length; i++) {
            right = right - nums[i];
            if (right == left) {
                return i;
            } else {
                left += nums[i];
            }

        }

        return -1;
    }

    public int pivotIndex2(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }

        if (leftSum == rightSum) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            leftSum += nums[i - 1];
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
