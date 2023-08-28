package main.java.LeetCode.Binary.InsertPosition;

import main.java.LeetCode.Binary.search.BinarySearch;

public class Main {
    public static void main(String[] args) {
        InsertPosition insertPosition = new InsertPosition();
        int[] array = {1,3,5,6};
        int target = 5;
        System.out.println(insertPosition.searchInsert(array, target));
        target = 2;
        System.out.println(insertPosition.searchInsert(array, target));
    }
}
