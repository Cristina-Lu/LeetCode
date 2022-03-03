package com.difficult;

import com.toolClasses.ToString;
import org.junit.Test;

public class Problem239SlidingWindowMaximumTest {
    @Test
    public void test(){
        Problem239SlidingWindowMaximum problem239SlidingWindowMaximum
                =new Problem239SlidingWindowMaximum();

        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        ToString.SingleInt(problem239SlidingWindowMaximum.maxSlidingWindow(nums,3));

        ToString.SingleInt(problem239SlidingWindowMaximum.maxSlidingWindow(new int[]{1},1));
    }
}
