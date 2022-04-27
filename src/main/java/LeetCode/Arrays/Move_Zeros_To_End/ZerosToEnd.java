package main.java.LeetCode.Arrays.Move_Zeros_To_End;

import java.util.Arrays;

public class ZerosToEnd {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int i = 0;
        int k = 0;

        while (i < length) {
            if (nums[i] == 0){
                i++;
            }else {
                nums[k] = nums[i];
                k++;
                i++;
            }
        }
        int remaining = length - i;
        while (k < length) {
            nums[k++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
