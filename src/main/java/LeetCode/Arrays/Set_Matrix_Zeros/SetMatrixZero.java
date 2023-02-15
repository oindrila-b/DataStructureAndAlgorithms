package main.java.LeetCode.Arrays.Set_Matrix_Zeros;

public class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        int rows  = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0 ; i < rows; i++) {
            for(int j = 0 ; j <cols ; j++ ){
                if(matrix[i][j] == 0) {
                    changeRowColValues(matrix, i,j ,rows, cols);
                }
            }
        }
        for(int i = 0 ; i < rows; i++) {
            for(int j = 0 ; j <cols ; j++ ){
                if(matrix[i][j] == Integer.MAX_VALUE + 2) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

    private void changeRowColValues(int[][] matrix,int i, int j , int rows, int cols) {
        // row value = i constant, and column value(rep = l) changes
        for (int l =0 ; l< cols; l++) {
            if(matrix[i][l]  == 0) {

            } else {
                matrix[i][l] = Integer.MAX_VALUE + 2 ;
            }
        }

        // column value = j constant, and row value(rep = k) changes
        for (int k =0 ; k< rows; k++) {
            if(matrix[k][j] == 0){

            }else {
                matrix[k][j] = Integer.MAX_VALUE + 2;
            }
        }
    }
}
