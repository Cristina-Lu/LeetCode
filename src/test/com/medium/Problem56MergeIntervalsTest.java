package com.medium;

import org.junit.Test;

public class Problem56MergeIntervalsTest {
    @Test
    public void test(){
        Problem56MergeIntervals problem56MergeIntervals
                = new Problem56MergeIntervals();
        System.out.println(problem56MergeIntervals.merge(new int[][]{{1,3},{4,6},{2,8}}));
    }
}
