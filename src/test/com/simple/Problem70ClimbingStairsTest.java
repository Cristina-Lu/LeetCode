package com.simple;

import org.junit.Test;

public class Problem70ClimbingStairsTest {
    @Test
    public void test(){
        Problem70ClimbingStairs problem70ClimbingStairs = new Problem70ClimbingStairs();
        System.out.println(problem70ClimbingStairs.climbStairs(5));//8

        System.out.println(problem70ClimbingStairs.climbStairs(8));//34

        System.out.println(problem70ClimbingStairs.climbStairs(45));

        System.out.println(problem70ClimbingStairs.climbStairs(2));
    }
}
