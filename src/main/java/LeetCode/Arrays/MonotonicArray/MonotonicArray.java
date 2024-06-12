package main.java.LeetCode.Arrays.MonotonicArray;

public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if (n == 1) return true;

        boolean isInc = true;
        boolean isDec = true;

        for (int i = 1; i < n; i++) {
            if (!isInc && !isDec) {
                return false;
            }

            if (nums[i] < nums[i - 1]) {
                isInc = false;
            }
            if (nums[i] > nums[i - 1]) {
                isDec = false;
            }
        }

        return isInc || isDec;

    }

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{6,5,4,4}));
    }
}
