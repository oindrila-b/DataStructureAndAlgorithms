package main.java.BasicDSandAlgorithmImplementations.Algorithms.Sort.InsertionSort;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (var i =1; i < array.length ; i ++) { // to iterate over the array ; i = 1  as there's no element before i=0
            var current = array[i]; // store the value of the current
                                                                    // element to check with the previous elements
              var j = i-1; // variable to check all the elements before the current element

            while (j >= 0 && array[j] > current) { // as long as j is greater than or equal to 0
                // and the element at j is greater than the element at current we keep
                // shifting the elements to the right if it's current position
                array[j+1 ] = array[j];
                j--;

            }
            array[j+1] = current; // put the value of current in the sorted place

        }
    }

}
