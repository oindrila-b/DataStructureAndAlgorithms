package main.java.LeetCode.Arrays.FindSumPairs;

public class Main {


    public static void main(String[] args) {

        int[] nums1 = {1, 1, 2, 2, 2, 3};
        int[] nums2 = {1, 4, 5, 2, 5, 4};

        FindSumPairs findSumPairs = new FindSumPairs(nums1,nums2);

        System.out.println(findSumPairs.count(7));

    }
}
