package main.java.LeetCode.Arrays.DisappearedNumberInArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DisappearedNumber {
    //    public List<Integer> findDisappearedNumbers(int[] nums) {
//        Arrays.sort(nums);
//        List<Integer> missingInteger = new ArrayList<>();
//        List<Integer> numsList = Arrays.stream(nums).boxed().toList();
//        System.out.println(numsList);
//
//        for (int i = 0; i < numsList.size(); i++) {
//            if (!numsList.contains(i+1)){
//                missingInteger.add(i+1);
//            }
//        }
//        System.out.println(missingInteger);
//            return missingInteger;
//    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int orgVal = Math.abs(nums[i]);
            int idx = orgVal - 1;
            if (nums[idx] > 0)
                nums[idx] *= -1;
        }

        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (nums[i] > 0)
                al.add(i + 1);

        return al;
    }
}
