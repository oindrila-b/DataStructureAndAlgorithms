package main.java.LeetCode.TwoPointer.Three_Sum;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSumList = new ArrayList<>();
        List<Integer> threeSum = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            List<Integer> twoSum = twoSum(nums, (i+1), (nums[i]*-1));
            if (twoSum.size() < 1) {
                continue;
            } else {
                threeSum.add(nums[i]);
                threeSum.addAll(twoSum);
            }
            threeSumList.add(threeSum);
//            twoSum.clear();
//            threeSum.clear();
        }
        return threeSumList;
    }

    public List<Integer> twoSum(int[] nums, int startIndex, int target) {
         List<Integer> twoSum = new ArrayList<>();

        HashMap<Integer, Integer> numberIndices = new HashMap<>();
        for (int i = startIndex; i < nums.length ; i++) {
            if (numberIndices.containsKey(target - nums[i])) {
                System.out.println("Index 1 : " + numberIndices.get(target - nums[i]) + " Index 2 : " +i);
                twoSum.add(nums[i]);
                twoSum.add((target - nums[i]));
            } else {
                numberIndices.put(nums[i], i );
            }
        }
        return new ArrayList<>();
    }
}

