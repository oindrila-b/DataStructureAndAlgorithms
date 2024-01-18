package main.java.LeetCode.Arrays.LongestConsecutiveSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

        int size=0;
        int max = 0;
        if (nums.length == 0) return 0;
        // first we sort the array
        Arrays.sort(nums);
        int prev = nums[0]; // we're considering the first element to be the start of our consecutive seq
        for (int i = 1; i < nums.length; i++) {
            if (prev+1 == nums[i]) { // if prev+1 = our current number, then it is a consecutive seq
                size++;
            } else if (prev == nums[i]) { // if prev and this number is same, continue
                continue;
            }else {
                max = Math.max(max, size+1); // if there's a disruption in the sequence, compare the current size with the max value and store it
                size=0; // re-initialise size to 0 fr new sequence
            }
            prev = nums[i]; // make prev number as current number
        }
        return Math.max(max, size+1); // return the max value of
        // we do size plus 1 because during our calculation, we already have two consecutive elements but we only increment once
    }
}
