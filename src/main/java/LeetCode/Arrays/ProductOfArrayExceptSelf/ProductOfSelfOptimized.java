package main.java.LeetCode.Arrays.ProductOfArrayExceptSelf;

import java.util.Arrays;

public class ProductOfSelfOptimized {

    // MULTIPLY PREFIX PRODUCT WITH POSTFIX PRODUCT
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] arr = new int[nums.length];
        Arrays.fill(arr,1); //FILLING RESULT ARRAY WITH 1
        // CALCULATING PRODUCT OF PREFIX NUMBERS
        for (int i = 0; i < nums.length; i++) {
            arr[i] *= product;
            product*= nums[i];
        }
        product = 1;
        // CALCULATING PRODUCT OF POSTFIX NUMBERS
        for (int i = nums.length -1; i >= 0; i--) {
            arr[i] *= product;
            product*= nums[i];
        }
        return  arr;
    }
}
