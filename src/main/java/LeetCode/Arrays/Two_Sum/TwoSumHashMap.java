package main.java.LeetCode.Arrays.Two_Sum;

import java.util.HashMap;

public class TwoSumHashMap {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numberIndices = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if (numberIndices.containsKey(target - nums[i])) {
                System.out.println("Index 1 : " + numberIndices.get(target - nums[i]) + " Index 2 : " +i);
                return new int[] {i, numberIndices.get(target - nums[i])};
            } else {
                numberIndices.put(nums[i], i );
            }
        }
        return new int[]{};
    }
}
