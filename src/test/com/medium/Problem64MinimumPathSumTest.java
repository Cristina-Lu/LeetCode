package com.medium;

import org.junit.Test;

public class Problem64MinimumPathSumTest {
    @Test
    public void test(){
        Problem64MinimumPathSum problem64MinimumPathSum
                = new Problem64MinimumPathSum();
        System.out.println(problem64MinimumPathSum.minPathSum(
                new int[][]{{1,3,1},{1,5,1},{4,2,1}}
        ));
        System.out.println(problem64MinimumPathSum.minPathSum(
                new int[][]{{1,2,3},{4,5,6}}
        ));
    }
}
