package main.java.Blind75_Medium;

import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length]; // we create a new array that will store the result
        Arrays.fill(arr,1); // and fill it with 1
        int product = 1;
        // first run multiply all digits in left
            // when i = 0, the first element won't have anything to it's left to multiply with so it'll multiply with 1,
            // for the next turn, product's value would change to the current value
        for (int i = 0; i < nums.length; i++) {
            arr[i]*= product;
            product *= nums[i];
        }
        // second run multiply all digits in right
            // when i =length -1, the last  element won't have anything to it's right to multiply with so it'll multiply with 1,
            // for the next turn, product's value would change to the current value
         product = 1;
        for (int i = nums.length-1; i >=0 ; i--) {
            arr[i] *= product;
            product *= nums[i];
        }

        return arr;
    }
}
