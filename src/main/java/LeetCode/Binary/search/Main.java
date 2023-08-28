package main.java.LeetCode.Binary.search;

import main.java.LeetCode.Binary.search.BinarySearch;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {2,5,6,8,10,13,25,75};
        int target = 13;
        System.out.println(binarySearch.search(array, target));
         target = 89;
        System.out.println(binarySearch.search(array, target));
    }
}
