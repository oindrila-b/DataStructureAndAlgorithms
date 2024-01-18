package main.java.LeetCode.Arrays.FindPivotIndex;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int endIndex = nums.length;

        for (int i = 0; i < endIndex; i++) {
            if (i == 0) {
                int rightSum = findSubArraySum(nums, i+1, endIndex);
                if (rightSum == 0) return 0;
            } else if (i == endIndex -1) {
                int leftSum = findSubArraySum(nums, 0, endIndex -1);
                if (leftSum == 0) return endIndex-1;
            } else {
                int leftSum = findSubArraySum(nums, 0, i);
                int rightSum = findSubArraySum(nums, i+1, endIndex);
                if (leftSum == rightSum) return i;
            }
        }
        return -1;
    }

    private int findSubArraySum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <end ; i++) {
            sum+= arr[i];
            System.out.println(sum);
        }
        return sum;
    }
}
