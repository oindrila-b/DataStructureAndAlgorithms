package main.java.LeetCode.Arrays.Plus_One;

import java.util.Arrays;

public class PlusOneMain {
    public static void main(String[] args) {

        PlusOne plusOne = new PlusOne();

        int[] arr = {4,3,2,1};

        int[] arr2 = {9};

        int[] arr3 = {9,8,7,6,5,4,3,2,1,0};

//        System.out.println(Arrays.toString(plusOne.plusOne(arr)));
//
//        System.out.println(Arrays.toString(plusOne.plusOne(arr2)));

        System.out.println(Arrays.toString(plusOne.plusOne(arr3)));

    }
}
