package main.java.LeetCode.Arrays.Set_Matrix_Zeros;

public class Main {
    public static void main(String[] args) {
        SetMatrixZero setMatrixZero = new SetMatrixZero();

        int[][] arr = {{1,1,1},
                {1,0,1},
                {1,1,1}};

        int[][] arr2= {
                {1,1,1,1},
                {1,0,1,1},
                {1,1,0,1},
                {0,0,0,1}};

        for (int i = 0; i < arr.length; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println();
        setMatrixZero.setZeroes(arr);
            // Loop through all rows
            for (int i = 0; i < arr.length; i++) {
                // Loop through all elements of current row
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            }

        System.out.println( "---------------------------- OPTIMIZED APPROACH -------------------------");

            SetMatrixZeroOptimized setMatrixZeroOptimized = new SetMatrixZeroOptimized();

        for (int i = 0; i < arr2.length; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println();
        setMatrixZeroOptimized.setZeroes(arr2);
        // Loop through all rows
        for (int i = 0; i < arr2.length; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();

        }

    }

}
