package main.java.LeetCode.Arrays.Shuffle_Array;

public class ShuffleArrays {
    public int[] shuffle(int[] nums, int n) {
        int array[] = new int[nums.length];
        int i,j,k=0;
    n = (nums.length /2) - 1 ;
    for (i=0, j=n+1; (i <=n && j<nums.length) ; i++,j++ ) {
        array[k++] =nums[i];
        array[k++] = nums[j];
    }
    return array;
    }
}
