package main.java.LeetCode.SlidingWindow.ContainsDuplicate2;


//Example 1:
//
//        Input: nums = [1,2,3,1], k = 3
//        Output: true

//Example 3:
//
//        Input: nums = [1,2,3,1,2,3], k = 2
//        Output: false


import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

    Map<Integer, Integer> duplicteMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (duplicteMap.containsKey(nums[i])){
                int index = duplicteMap.get(nums[i]);
                if (Math.abs(index - i) <= k) return true;
            }
            duplicteMap.put(nums[i], i);

        }
    return false;
    }
}
