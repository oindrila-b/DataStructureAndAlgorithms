package main.java.LeetCode.Arrays.MergeSortedArray;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int total = m+n;
        int i = 0;
       while (m < total && i < n){
           nums1[m] = nums2[i];
           m++;
           i++;
       }

        Arrays.sort(nums1);
    }
}
