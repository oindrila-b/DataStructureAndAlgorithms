package main.java.LeetCode.Arrays.ProductOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int answer[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            answer[i]= multiply(nums, nums.length -1, nums[i]);
            System.out.println(answer[i]);
        }
        return answer;
    }
//USE RECURSION
    private int multiply(int[] arr, int n, int ignoreInteger) {
      return 0;
    }
}
