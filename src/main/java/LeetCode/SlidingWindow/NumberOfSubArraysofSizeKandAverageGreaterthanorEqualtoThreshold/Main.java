package main.java.LeetCode.SlidingWindow.NumberOfSubArraysofSizeKandAverageGreaterthanorEqualtoThreshold;

public class Main {
    public static void main(String[] args) {
        NumberOfSubArrays numberOfSubArrays = new NumberOfSubArrays();
        System.out.println(numberOfSubArrays.numOfSubarrays(new int[] {11,13,17,23,29,31,7,5,2,3}, 3,5));
        System.out.println(numberOfSubArrays.numOfSubarrays(new int[] {2,2,2,2,5,5,5,8}, 3,4));
    }
}
