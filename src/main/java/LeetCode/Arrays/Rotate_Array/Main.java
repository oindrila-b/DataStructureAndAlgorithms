package main.java.LeetCode.Arrays.Rotate_Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        RotatedArray rotatedArray = new RotatedArray();
        rotatedArray.rotate(nums,k);

      //  System.out.println(Arrays.toString(nums));
    }
}
