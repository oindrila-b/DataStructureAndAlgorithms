package LeetCode.Arrays;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int i;
        int sum = 0;
        int[] runningSum = new int [len];
        for(i=0;i<len;i++){
            sum = sum + nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}
