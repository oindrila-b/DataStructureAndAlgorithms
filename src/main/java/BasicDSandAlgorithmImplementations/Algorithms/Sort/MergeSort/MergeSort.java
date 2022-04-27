package main.java.BasicDSandAlgorithmImplementations.Algorithms.Sort.MergeSort;

public class MergeSort {
    public void mergeSort(int[] arr){
        mergesort(arr, new int[arr.length] , 0 , arr.length -1);
    }

    public void mergesort(int[] arr, int[] temp , int left, int right){
        if (left >= right){
            return;
        }
        int middle = (left + right)/2;
        mergesort(arr, temp  ,left,middle);
        mergesort(arr, temp,middle+1,right);
        mergeHalves(arr , temp ,left,right);
    }

    public void mergeHalves(int[] arr, int[] temp, int left, int right){
            int leftEnd = (left+right)/2;
            int rightStart = leftEnd+1;
            int size = (right-left)+1;

            int leftIndex = left;
            int rightIndex = right;
            int index = leftIndex;

            while (leftIndex <= leftEnd && rightIndex <= rightIndex) {

            }
    }
}
