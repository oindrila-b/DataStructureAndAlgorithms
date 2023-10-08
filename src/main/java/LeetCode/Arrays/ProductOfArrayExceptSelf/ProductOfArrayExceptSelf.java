package main.java.LeetCode.Arrays.ProductOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i]= multiply(nums, nums.length -1, nums[i]);
            System.out.println(answer[i]);
        }
        return answer;
    }
//USE RECURSION
    private int multiply(int[] arr, int n, int ignoreInteger) {
        int i = 0;
        int product = 1;
        while(i <= n){
            if (arr[i] == ignoreInteger) {
                i++;
            }else if(arr[i] == 0){
                product *= 0;
            }
            else {
                product*= arr[i];
                i++;
            }
        }
        return product;
    }
}
