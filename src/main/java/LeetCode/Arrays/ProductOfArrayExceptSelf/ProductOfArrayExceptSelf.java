package main.java.LeetCode.Arrays.ProductOfArrayExceptSelf;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int answer[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i]= multiply(nums, nums.length -1, nums[i]);
            System.out.println("Number " + nums[i] + " resultant of multiplication " +  answer[i]);
        }
        return answer;
    }
//USE RECURSION
    private int multiply(int[] arr, int n, int ignoreInteger) {
        int result = 0;
     if(n==0 && arr[n]!= ignoreInteger) result =  arr[n];
     else if (arr[n] == ignoreInteger) result =  1;
     else {
         result = (arr[n] * multiply(arr, n - 1, ignoreInteger));
         System.out.println(result);
     }
        return result;
    }
}
