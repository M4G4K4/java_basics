package org.example.code_examples;

public class FindPeakElement {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1, 2, 3, 4}));
    }

    public static int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max  = nums[i];
                index  = i;
            }
        }
        return index;
    }
}
