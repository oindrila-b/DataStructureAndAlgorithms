package main.java.LeetCode.Arrays.MajorityElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// 111122222
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int targetOccurrenceCount = nums.length / 2;
        Map<Integer, Integer> elementCountMap = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
                elementCountMap.put(nums[i], elementCountMap.getOrDefault(nums[i] , 0) +1);
                if (elementCountMap.get(nums[i]) > targetOccurrenceCount) {
                    return nums[i];
                }
        }
        return -1;
    }
}
