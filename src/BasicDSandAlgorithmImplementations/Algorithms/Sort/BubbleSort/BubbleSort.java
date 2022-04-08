package BasicDSandAlgorithmImplementations.Algorithms.Sort.BubbleSort;

public class BubbleSort {

    public static void swap(int[] array, int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void bubbleSort(int[] array) {
        boolean isSorted = false; // set flag to false
        int lastUnsorted = array.length -1;
        while (!isSorted) { // while the array isn't sorted(i.e., isSorted = false) keep sorting it and exit when it's sorted
            isSorted = true; // set isSorted to true
            for (int i=0; i <lastUnsorted; i++) {
                if (array[i] > array[i+1]){
                    swap(array, i, i+1);
                    isSorted = false; //set isSorted to false when there's a swap, cuz that indicates that the array isn't sorted
                    //if no swap occurs the value of isSorted remains true , and we exit the loop.
                }
            }
            lastUnsorted --; // this value decreases and in each run the last element will always be sorted , so we can stop the algorithm once ot reaches the sorted element
        }
    }
}
