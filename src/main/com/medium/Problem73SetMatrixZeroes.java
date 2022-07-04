package com.medium;

public class Problem73SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int[] rows = new int[matrix.length];
        int[] leng = new int[matrix[0].length];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j] == 0){
                    rows[i] = 1;
                    leng[j] = 1;
                }
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            boolean flag = false;
            if(rows[i] == 1){
                flag = true;
            }
            for (int j = 0; j <matrix[0].length ; j++) {
                if (flag){
                    matrix[i][j] = 0;
                }else if (leng[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
