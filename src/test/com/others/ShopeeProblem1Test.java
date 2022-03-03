package com.others;

import com.toolClasses.ToString;
import org.junit.Test;

public class ShopeeProblem1Test {
    @Test
    public void test(){
        ShopeeProblem1 shopeeProblem1 = new ShopeeProblem1();
        int nums[]={2,0,1,0,1};
        ToString.SingleInt(shopeeProblem1.problem(nums));
    }
}
