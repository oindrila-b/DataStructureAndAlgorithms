package main.java.LeetCode.Arrays.NextGreaterElement1;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int []  resultArray = new int[nums1.length];
        Map<Integer, Integer> nextGreaterElement = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            if (i == nums2.length-1) {
                nextGreaterElement.put(nums2[i], -1);
            }else {
               int j = i+1;
                while (j < nums2.length) {
                    if (nums2[j] > nums2[i]) {
                        nextGreaterElement.put(nums2[i], nums2[j]);
                        j=0;
                        break;
                    } else {
                        j++;
                    }
                    nextGreaterElement.put(nums2[i], -1);
                }
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            resultArray[i] = nextGreaterElement.get(nums1[i]);
        }

    return resultArray;
    }
}
