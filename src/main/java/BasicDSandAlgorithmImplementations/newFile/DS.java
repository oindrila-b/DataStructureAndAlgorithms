package main.java.BasicDSandAlgorithmImplementations.newFile;

import java.util.Arrays;

public class DS {
    public static void main(String[] args) {
        int[] array= {2,3,4,5,7};
        int numberOfRotations = 6;

        System.out.println(Arrays.toString(array));


        for (int j = 0; j < numberOfRotations; j++) {
            int key = array[array.length-1];
            int i = array.length-1;
            while(i>0) {
                array[i] = array[i-1];
                i--;
            }
            array[i] = key;
            System.out.println(Arrays.toString(array));
        }
    }
}
