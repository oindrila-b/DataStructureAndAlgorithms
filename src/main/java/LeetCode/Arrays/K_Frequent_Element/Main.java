package main.java.LeetCode.Arrays.K_Frequent_Element;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        KFrequentElement kFrequentElement = new KFrequentElement();
        int[] arr = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(kFrequentElement.topKFrequent(arr, 2)));

//        System.out.println("Hello");
    }
}
