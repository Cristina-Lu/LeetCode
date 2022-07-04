package com.medium;

import org.junit.Test;

public class Problem74Searcha2DMatrixTest {


    @Test
    public void searchMatrix() {
        int[][] t = new int[][]{
                {1,3,5,7},{10,11,16,20},{23,30,34,60}
        };
        Problem74Searcha2DMatrix problem74Searcha2DMatrix = new Problem74Searcha2DMatrix();
        System.out.println(problem74Searcha2DMatrix.searchMatrix(t,11));//true

        int[][] t1 = new int[][]{{1}};
        System.out.println(problem74Searcha2DMatrix.searchMatrix(t1,1));
    }
}
