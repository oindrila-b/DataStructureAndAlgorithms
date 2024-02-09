package main.java.LeetCode.Binary.SingleElemenIinSortedArray;

public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length -1;

        while (start <= end) {
            int mid = start + (start + end)/2;
            if ((mid-1 < 0 || nums[mid - 1]!= nums[mid] )&&(mid+1 == nums.length || nums[mid]!= nums[mid+1])) return nums[mid];

            int left = (nums[mid-1]==nums[mid])?mid-1:mid;

            if (left%2 == 0){
                start = mid+1;
            }else {
                end = mid-1;
            }

        }
    return -1;
    }
}
