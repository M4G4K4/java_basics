package org.example.code_examples;

import java.util.*;

public class two_sum {
    public static void main(String[] args) {

        int[] nums = {3, 2, 4};

        int[] result = twoSum(nums, 6);
        int[] result2 = twoSum2(nums, 6);


        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }

    // The fastest implementation
    // Complexity : O(n)
    public static int[] twoSum4(int[] nums, int target) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer number = map.get(nums[i]);
            if(number != null){
                return new int[]{i, number};
            }
            map.put(target - nums[i], i);
        }
        return nums;
    }

    public static int[] twoSum(int[] nums, int target) {
        final List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    result.add(i);
                    result.add(j);
                    return result.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }

        return null;
    }

    // Second iteration , try to save some memory to not initialize an array list
    // Complexity: O(n^2)
    public static int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public static int[] twoSum3(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
}
