package main.java.LeetCode.Arrays.Find_Common_Elements_In_Sorted_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindInSortedArray {

    static void findCommon(int ar1[], int ar2[], int ar3[]){

        int count =0;
        List<Integer> commonArrayElement = new ArrayList<>();

        Integer[] array1 = Arrays.stream( ar1 ).boxed().toArray( Integer[]::new );
        Integer[] array2 = Arrays.stream( ar2 ).boxed().toArray( Integer[]::new );
        Integer[] array3 = Arrays.stream( ar3 ).boxed().toArray( Integer[]::new );

        List<Integer> resultList  = new ArrayList<>(ar1.length + ar2.length+ ar3.length);
        Collections.addAll(resultList,array1);
        Collections.addAll(resultList,array2);
        Collections.addAll(resultList,array3);

        Collections.sort(resultList);
        System.out.println(resultList);

            for (int i =0 ; i < resultList.size() -1; i++) {
                if (resultList.get(i) == resultList.get(i+1)){
                    count++;
                }
                if (count == 2) {
                    System.out.println(resultList.get(i));
                    commonArrayElement.add(resultList.get(i));
                    count =0;
                    return;
                }
            }

        System.out.println(commonArrayElement);
    }

    public static void main(String[] args) {

        int[] arr= {1, 5, 10, 20, 40, 80} ;

        int[] arr2= {6, 7, 20, 80, 100} ;

        int[] arr3= {3, 4, 15, 20, 30, 70, 80, 120} ;

        findCommon(arr,arr2,arr3);
    }

}
