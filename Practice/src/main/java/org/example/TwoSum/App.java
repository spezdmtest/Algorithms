package org.example.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class App {
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 7, 11, 15};
        int[] result1 = twoSum(array1, 9);
        System.out.println(Arrays.toString(result1));
        System.out.println("------------");
        int[] array2 = {3, 2, 4};
        int[] result2 = twoSum(array2, 6);
        System.out.println(Arrays.toString(result2));
        System.out.println("------------");
        int[] array3 = {3, 3};
        int[] result3 = twoSum(array3, 6);
        System.out.println(Arrays.toString(result3));
        System.out.println("------------");
    }
}
