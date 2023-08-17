package main.java.LeetCode.Binary;

public class BinarySearch {
    public int search(int[] nums, int target) {

        int startIndex = 0;
        int endIndex = nums.length -1;

        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex)/2;

            if (nums[midIndex] ==target) return midIndex;

            if (target < nums[midIndex] ) {
                endIndex = midIndex - 1;
            }else if (target > nums[midIndex]){
                startIndex = midIndex + 1;
            }
        }
        return -1;
    }
}
