package main.java.BasicDSandAlgorithmImplementations.Algorithms.Sort.QuickSort;

public class QuickSort {
    public void  quickSort(int[] array) {
        quicksort(array,0, array.length-1);
    }

    private void quicksort(int[] array, int left, int right){
        if(left >= right) {
            return;
        }
        int pivot = array[(left+right)/2];
            int index = partition(array,left, right, pivot);
            quicksort(array,left, index-1);
            quicksort(array,index,right);
    }

    public int partition(int[] arr, int left, int right, int pivot) {
        while(left<=right){
        while (arr[left]< pivot) {
            left ++;
        }
        while (arr[right] > pivot){
            right --;
        }

        if (left <= right) {
            swap(arr,left,right);
            left++;
            right --;
        }
        }

        return  left;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
