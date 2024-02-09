package main.java.LeetCode.Binary.FindMinimum;

import java.util.Arrays;

public class FindMinimumInRotatedArray {
    public static int findMin(int[] nums) {
        // logic to find the min number, if the array has been rotated, then,
        // 1. The value of leftmost element will be greater than the value of the rightmost element
        // 2. Observation : The minimum number always lies in the sub-array where the difference bw the
        // mid-value and the leftmost or rightmost is greater
        int start = 0;
        int end = nums.length -1;
        while (start < end) {
            int m = (start + end)/2;
            if(nums[m] < nums[end]) {
                end = m;
            }else{
                start = m+1;
            }
        }
        System.out.println(nums[start]);
        return nums[start];

    }

    /**
     *
     * class Solution {
     *     public int findMin(int[] nums) {
     *         int start = 0;
     *         int end = nums.length - 1;
     *
     *         while (start < end) {
     *             int mid = start + (end - start) / 2;
     *             if (nums[mid] > nums[end]) {
     *                 start = mid + 1;
     *             } else {
     *                 end = mid;
     *             }
     *         }
     *         return nums[start];
     *     }
     * }
     *
     * ***/

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(Arrays.toString(arr));
        findMin(arr);
    }
}
