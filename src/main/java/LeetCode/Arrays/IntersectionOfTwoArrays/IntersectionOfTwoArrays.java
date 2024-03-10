package main.java.LeetCode.Arrays.IntersectionOfTwoArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> intersection = new HashSet<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < nums1.length && pointer2 < nums2.length) {
            if (nums1[pointer1] == nums2[pointer2]) {
                intersection.add(nums1[pointer1]);
            }
            if (nums1[pointer1] > nums2[pointer2]) pointer2++;
            else pointer1++;
        }
        System.out.println(intersection);
        return intersection.stream().mapToInt(x ->x).toArray();
    }
}
