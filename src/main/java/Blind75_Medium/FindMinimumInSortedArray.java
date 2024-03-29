package main.java.Blind75_Medium;

public class FindMinimumInSortedArray {

    public int findMin(int[] nums) {
        int start = 0, end = nums.length -1;
        while (start < end) {
            int mid = (start + end) /2;
            if (nums[mid] < nums[end]) {
                end = mid;
            }else {
                start = mid +1;
            }
        }
        return nums[start];
    }
}
