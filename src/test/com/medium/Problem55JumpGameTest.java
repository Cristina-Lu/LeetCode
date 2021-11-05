package com.medium;

import org.junit.Test;

public class Problem55JumpGameTest {
    @Test
    public void test(){
        Problem55JumpGame problem55JumpGame
                = new Problem55JumpGame();
        System.out.println(problem55JumpGame.canJump(new int[]{2,3,1,1,4}));
        System.out.println(problem55JumpGame.canJump(new int[]{3,2,1,0,4}));
        System.out.println(problem55JumpGame.canJump(new int[]{2,0,0}));
        System.out.println(problem55JumpGame.canJump(new int[]{1,3,2}));
        System.out.println(problem55JumpGame.canJump(new int[]{1}));
        System.out.println(problem55JumpGame.canJump(new int[]{1,1,2,2,0,1,1}));
    }
}
