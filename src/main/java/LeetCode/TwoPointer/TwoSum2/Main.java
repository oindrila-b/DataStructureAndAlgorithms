package main.java.LeetCode.TwoPointer.TwoSum2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum2 twoSum2 = new TwoSum2();
        System.out.println(Arrays.toString(twoSum2.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum2.twoSum(new int[]{2, 3, 4}, 6)));
        System.out.println(Arrays.toString(twoSum2.twoSum(new int[]{-1, 0}, -1)));
    }
}
