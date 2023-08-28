package main.java.LeetCode.Binary.InsertPosition;

public class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start  = 0;
        int end = nums.length - 1;
        int mid = 0;

        while (start <= end) {
          mid  = start + (end - start)/2;

            if (nums[mid] == target) return mid;
            else if (target < nums[mid])  end = mid - 1;
            else if (target > nums[mid]) start = mid + 1;
        }

        return start;
    }
}
