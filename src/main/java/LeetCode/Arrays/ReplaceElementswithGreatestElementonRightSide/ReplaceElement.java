package main.java.LeetCode.Arrays.ReplaceElementswithGreatestElementonRightSide;

import java.util.ArrayList;

public class ReplaceElement {
    public int[] replaceElements(int[] arr) {
        if (arr.length < 1){
            return new int[] {-1};
        }
        int max = -1;
        for(int i = arr.length -1 ; i>=0; i--) {
            if (arr[i] > max) {
                int temp = max;
                max =  arr[i];
                arr[i] = temp;
            }else {
                arr[i] = max;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    return arr;
    }
}
