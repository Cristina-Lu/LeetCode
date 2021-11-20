package com.medium;

import org.junit.Test;

public class Problem63UniquePathsTwTest {
    @Test
    public void test(){
        Problem63UniquePathsTw problem63UniquePathsTw
                = new Problem63UniquePathsTw();
        System.out.println(problem63UniquePathsTw.uniquePathsWithObstacles(
                new int[][]{{0,0,0},{0,1,0},{0,0,0}}
        ));

        System.out.println(problem63UniquePathsTw.uniquePathsWithObstacles(
                new int[][]{{0,1},{0,0}}
        ));

        System.out.println(problem63UniquePathsTw.uniquePathsWithObstacles(
                new int[][]{{1,0}}
        ));
    }
}
