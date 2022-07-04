package com.difficult;

import org.junit.Test;

public class Problem85MaximalRectangleTest {
    @Test
    public void test(){
        Problem85MaximalRectangle problem85MaximalRectangle
                = new Problem85MaximalRectangle();
        char[][] chars = new char[][]{
                {'1','0','0','1','0','0','1','1','0'},
                {'1','0','1','0','0','1','1','0','0'},
                {'0','1','1','1','1','0','0','1','0'},
                {'1','1','1','1','1','1','0','1','0'},
                {'1','1','1','1','1','0','1','0','1'},
                {'1','1','1','1','1','1','0','1','1'},
                {'1','1','1','1','1','0','0','1','1'},
                {'0','1','0','1','0','0','1','0','0'}
        };

        System.out.println(problem85MaximalRectangle.maximalRectangle(chars));
    }
}
