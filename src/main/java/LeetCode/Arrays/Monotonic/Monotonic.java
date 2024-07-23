package main.java.LeetCode.Arrays.Monotonic;

public class Monotonic {
    public boolean isMonotonic(int[] nums) {

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < nums.length; i++) {
            if (!isIncreasing && !isDecreasing) {
                return false;
            }
            if (nums[i] < nums[i -1]) {
                isIncreasing = false;
            }
            if (nums[i]>nums[i-1]) {
                isDecreasing = false;
            }
        }
        return isDecreasing || isIncreasing;
    }
}
