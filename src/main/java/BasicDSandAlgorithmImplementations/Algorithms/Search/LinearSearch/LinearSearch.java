package main.java.BasicDSandAlgorithmImplementations.Algorithms.Search.LinearSearch;

public class LinearSearch {

    public Integer linearSearch(int[]  array, int target) {
            for(int i = 0 ; i < array.length; i++) {
                if(array[i] == target) {
                    return i;
                }
            }
            return  -1;
    }


    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] array = {5,8,2,13,75,6,25,10};

        int target = 6;

        System.out.println(linearSearch.linearSearch(array,target));

    }
}
