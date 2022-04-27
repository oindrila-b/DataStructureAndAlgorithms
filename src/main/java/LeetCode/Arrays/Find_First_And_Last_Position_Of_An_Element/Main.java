package main.java.LeetCode.Arrays.Find_First_And_Last_Position_Of_An_Element;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        FindFirstAndLastOfAnElement elem = new FindFirstAndLastOfAnElement();
        int[] arr = {5, 7, 7, 8, 8, 10};
        int[] result = elem.searchRange(arr, 8);
        System.out.println(Arrays.toString(result));
    }
}
