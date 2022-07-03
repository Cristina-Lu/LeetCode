package com.others;

import com.toolClasses.ToString;
import org.junit.Test;

public class MsProblemTest {
    @Test
    public void test(){
        MsProblem msProblem = new MsProblem();
        int[] nums ={2,5,6,3,8};
        ToString.SingleInt(msProblem.huadong(nums,4));
        int[] nums1 ={9,2,5,6,3,8};
        ToString.SingleInt(msProblem.huadong(nums1,4));
    }
}
