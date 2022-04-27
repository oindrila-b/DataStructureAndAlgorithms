package main.java.BasicDSandAlgorithmImplementations.Algorithms.Search.BinarySearch;

public class BinarySearch {

    // Iterative Binary search
    public Integer iterativeBinarySearch(int[] array , int target) {
        int startIndex = 0;  // start index
        int endIndex = array.length -1;  // end index of the array
        while (startIndex <= endIndex) {    // while the value of start index is less than or equal to the value of  end index
            int mid = (startIndex+endIndex) /2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target)  {
                startIndex = mid +1;
            }else if (array[mid] > target) {
                endIndex = mid -1;
            }
        }
        return  null;
    }


    public Integer  recursiveBinarySearch(int[] array , int target, int start, int end) {

        if (start> end){
            return -1;
        }else {
            int mid  =  ( start + end) / 2 ;
            if (array[mid] > target) {
                return  recursiveBinarySearch(array,target, start, mid-1);
            } else if (array[mid] < target) {
                return recursiveBinarySearch(array, target, mid+1, end);
            }else {
                return mid;
            }
        }

    }


    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {2,5,6,8,10,13,25,75};
        int target = 13;
        int start =0 ;
        int end = array.length -1;
        System.out.println(binarySearch.iterativeBinarySearch(array,target));
        System.out.println("===============================================");
        System.out.println(binarySearch.recursiveBinarySearch(array,target,start,end));

    }

}
