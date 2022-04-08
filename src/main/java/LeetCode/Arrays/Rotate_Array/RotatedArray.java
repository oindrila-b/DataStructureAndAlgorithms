package main.java.LeetCode.Arrays.Rotate_Array;

import java.util.ArrayList;
import java.util.List;

public class RotatedArray {
    public static void rotate(int[] nums, int k) {
      for (int i =0 ; i < k; i ++){

      }



    }

    private static void rotateKTimes(int[] nums) {
        int startPointer = 0;
        int onHoldValue = -1;
            while (startPointer <= nums.length-1){
                if (startPointer != nums.length-1){
                    onHoldValue = nums[startPointer +1];
                }
            }



    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int k = 0;
        rotate(array,k);

        int[] array2 = {1,2,3};
        int k2 = 3;
        rotate(array2,k2);

        for (int i =0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
    }

}
