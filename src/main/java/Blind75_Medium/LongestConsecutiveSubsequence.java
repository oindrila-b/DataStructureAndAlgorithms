package main.java.Blind75_Medium;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        if (nums.length == 0) return 0;
        int last = nums[0], size = 0, max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (last+1 == nums[i]){
                size++;
            } else if (last == nums[i]) {
                continue;
            }else{
                max = Math.max(max, size+1);
                size = 0;
            }
        }
        return Math.max(max, size+1);
    }
}
