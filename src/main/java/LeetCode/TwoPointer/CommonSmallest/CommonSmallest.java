package main.java.LeetCode.TwoPointer.CommonSmallest;

public class CommonSmallest {
    public int getCommon(int[] nums1, int[] nums2) {
        int num1Pointer = 0;
        int num2Pointer = 0;

        while (num1Pointer < nums1.length && num2Pointer < nums2.length){
            if (nums1[num1Pointer] == nums2[num2Pointer]) return nums2[num2Pointer];
            if (nums1[num1Pointer] > nums2[num2Pointer])  num2Pointer++;
            else num1Pointer ++;
        }
        return -1;
    }
}
