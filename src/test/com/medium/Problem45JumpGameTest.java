package com.medium;

import org.junit.Test;

public class Problem45JumpGameTest {
    @Test
    public void test(){
        Problem45JumpGame problem45JumpGame
                = new Problem45JumpGame();

        System.out.println("nums 2,3,1,1,4 and JumpTime is "+problem45JumpGame.jump(new int[]{2,3,1,1,4}));//基础测试用例
        System.out.println("nums 2,3,0,1,4 and JumpTime is "+problem45JumpGame.jump(new int[]{2,3,0,1,4}));//基础测试用例
        System.out.println("nums 2,1 and JumpTime is "+problem45JumpGame.jump(new int[]{2,1}));//最大跳跃超出数组范围问题
        System.out.println("nums 8,2,4,4,4,9,5,2,5,8,8,0,8,6,9,1,1,6,3,5,1,2,6,6,0,4,8,6,0,3,2,\n" +
                "8,7,6,5,1,7,0,3,4,8,3,5,9,0,4,0,1,0,5,9,2,0,7,0,2,1,0,8,2,5,1,2,3,9,7,4,7,0,0,\n" +
                "1,8,5,6,7,5,1,9,9,3,5,0,7,5 and JumpTime is "+problem45JumpGame.jump(new int[]{8,2,
                4,4,4,9,5,2,5,8,8,0,8,6,9,1,1,6,3,5,1,2,6,6,0,4,8,6,0,3,2,8,7,6,5,1,7,0,3,4,8,3,5,9,
                0,4,0,1,0,5,9,2,0,7,0,2,1,0,8,2,5,1,2,3,9,7,4,7,0,0,1,8,5,6,7,5,1,9,9,3,5,0,7,5}));//超时问题
        System.out.println("nums o and JumpTime is "+problem45JumpGame.jump(new int[]{0}));//边界问题
        System.out.println("nums 1,2,1,1,1 and JumpTime is "+problem45JumpGame.jump(new int[]{1,2,1,1,1}));
        System.out.println("nums 10,9,8,7,6,5,4,3,2,1,1,0 and JumpTime is "+problem45JumpGame.jump(
                new int[]{10,9,8,7,6,5,4,3,2,1,1,0}));//只考虑下一步最大化的贪心算法问题


    }
}
