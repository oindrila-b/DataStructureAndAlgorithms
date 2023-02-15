package main.java.LeetCode.Arrays.Set_Matrix_Zeros;

public class SetMatrixZeroOptimized {
    public void setZeroes(int[][] matrix) {

        // number of rows
        int rows  = matrix.length;

        // number of columns
        int cols = matrix[0].length;

        // variable that sets the entire first column to
        // 0 if any of the numbers in the column are 0
        int cols0 = 1;

        // traversal through the matrix
        for(int i = 0; i < rows; i++) {

            // check if any of the elements in the first column is 0
            // then all the elements in the column turn 0
            // therefore , cols= 0
            if(matrix[i][0] == 0) {
                cols0 = 0;
            }

            // traverse from the first column
            for (int j = 1 ; j < cols; j++){
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for (int i = rows -1; i >= 0 ; i --){
            for (int j = cols -1; j >= 0 ; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (cols0 == 0){
                matrix[i][0] = 0;
            }
        }

    }

}
