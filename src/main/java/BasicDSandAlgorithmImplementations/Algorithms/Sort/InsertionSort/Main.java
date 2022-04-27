package main.java.BasicDSandAlgorithmImplementations.Algorithms.Sort.InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 79,5,23,1,2,6,12,6,1,4,5,96,3,45,33,1,5,98,412,5};
            InsertionSort.insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
