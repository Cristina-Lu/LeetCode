package com.difficult;

import org.junit.Test;

public class Problem42TrappingRainWaterTest {
    @Test
    public void test(){
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        Problem42TrappingRainWater problem42TrappingRainWater
                =new Problem42TrappingRainWater();
        System.out.println(problem42TrappingRainWater.trap(height));

        int[] height1={4,2,3};
        System.out.println(problem42TrappingRainWater.trap(height1));

        int[] height2={4,2,0,3,2,5};
        System.out.println(problem42TrappingRainWater.trap(height2));

    }
}
