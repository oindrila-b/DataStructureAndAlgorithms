package main.java.LeetCode.Arrays.Rotate_Array;

import java.util.Arrays;

public class RotatedArray {
    public  void rotate(int[] nums, int k) {
        while (k>0){
            rotateKTimes(nums);
            k--;
        }

    }

    private  void rotateKTimes(int[] nums) {
        int endIndex = nums.length -1;
        int onHoldValue = nums[endIndex];
        System.out.println("End Index : " + endIndex);
        int tempValue = endIndex -1;
        System.out.println("Temp Value : " + tempValue);

        int[] newArray = nums.clone();
        System.out.println(Arrays.toString(newArray));

        while (endIndex > 0){
            nums[endIndex] = newArray[tempValue];
            System.out.println(newArray[tempValue]);
            System.out.println("Number in End Index : " + endIndex + "  :  " + nums[endIndex]);
            endIndex --;
            tempValue--;

        }
        System.out.println(Arrays.toString(nums));
        nums[0] = onHoldValue;
        System.out.println(Arrays.toString(nums));


        }



    }


