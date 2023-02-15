package main.java.LeetCode.Arrays.FindSumPairs;

import java.util.HashMap;
import java.util.Map;

public class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    // initialize hash map of integers to store frequency
    Map<Integer, Integer> map = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        // count the frequency of the numbers in nums2
        for (int number : nums2) {
            // if there's a value present in the map for the key = number, return the value else return 0
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
    }

    public void add(int index, int val) {
        // since nums2 numbers frequency was saved in the map
        // adding a value to nums2[index] will decrease the frequency for that number
        // as the value entirely changes, so we first decrease the frequency
         map.put(nums2[index], map.get(nums2[index]) - 1);

         // then we add the value to the nums2[index] number
        nums2[index] += val;

        // then we create a new frequency entry for that number
        map.put(nums2[index], map.getOrDefault(nums2[index], 0) + 1);
    }

    public int count(int tot) {
        int result = 0; // initialise a variable for count

        // for each number in the nums1 array
        for (int number : nums1) {
            // if the map contains the key (target - number)
            if (map.containsKey(tot - number)) {
                result += map.get(tot - number); // increase the value of result
            }
        }
        return result;
    }

}
