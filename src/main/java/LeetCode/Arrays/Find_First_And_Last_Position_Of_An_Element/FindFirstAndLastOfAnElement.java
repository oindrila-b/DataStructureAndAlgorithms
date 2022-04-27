package main.java.LeetCode.Arrays.Find_First_And_Last_Position_Of_An_Element;

import java.util.Arrays;

public class FindFirstAndLastOfAnElement {
    public int[] searchRange(int[] nums, int target) {

        int length = nums.length;
        int[] index = {-1,-1};

        for (int i = 0; i<length; i++){
            if (nums[i] == target) {
                index[0] = i;
                break;
            }
        }


        for (int i = length-1; i>=0; i--){
            if (nums[i] == target) {
                index[1] = i;
                break;
            }
        }

        System.out.println(Arrays.toString(index));
        return index;
    }



}
