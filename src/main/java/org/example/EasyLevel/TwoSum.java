package org.example.EasyLevel;

import java.util.Arrays;

public class TwoSum {
/*  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.*/

    public static void main(String[] args) {
        twoSum(new int[]{3, 3}, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int x = 0; x < nums.length; x++) {
            for (int y = x + 1; y < nums.length; y++) {
                if (nums[x] + nums[y] == target) {
                    result[0] = y;
                    result[1] = x;
                }
            }
        }
        if (result[0] == 0 && result[1] == 0) {
            System.out.println("No suitable combination");
        } else {
            System.out.println(Arrays.toString(result));
        }
        return result;
    }
}
