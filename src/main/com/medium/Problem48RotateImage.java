package com.medium;

public class Problem48RotateImage {
    public void rotate(int[][] matrix) {
        //转置(斜对角对称)
        for (int i =0;i<matrix.length;++i){
            for(int j=i+1;j<matrix.length;++j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
            }
        }
        //镜像对称
        for(int i=0;i<matrix[0].length/2;++i){
            for (int j=0;j<matrix.length;++j){
                int temp = matrix[j][i];
                matrix[j][i]=matrix[j][matrix[j].length-1-i];
                matrix[j][matrix[j].length-1-i] = temp;
            }
        }
        for(int i=0;i<matrix.length;++i){
            for (int j=0;j<matrix.length;++j){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
