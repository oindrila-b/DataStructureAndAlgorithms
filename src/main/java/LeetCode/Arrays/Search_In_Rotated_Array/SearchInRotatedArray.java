package main.java.LeetCode.Arrays.Search_In_Rotated_Array;

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return mid;

            // for the sorted elements before the mid element
            if (nums[mid] >= nums[start]) { // if mid_val > start_val  then  the first part is sorted
                // so we do binary search on the first part
                if (target >= nums[start] && target <= nums[mid]) { // means it lies b/w start and mid
                    end = mid - 1;  // decreasing end
                } else {
                    start = mid + 1;
                }
            } else {    // for the sorted elements after the mid element
                if (target >= nums[mid]
                        && target <= nums[end]) {
                    start = mid + 1;
                    // search in first half
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
