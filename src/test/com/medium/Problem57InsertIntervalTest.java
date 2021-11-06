package com.medium;

import com.toolClasses.ToString;
import org.junit.Test;

public class Problem57InsertIntervalTest {
    @Test
    public void test(){
        Problem57InsertInterval problem57InsertInterval
                = new Problem57InsertInterval();
        ToString.TwoFloorInt(problem57InsertInterval.insert(
                new int[][]{{1,3},{5,8},{6,12}},new int[]{4,8}));

        ToString.TwoFloorInt(problem57InsertInterval.insert(
                new int[][]{{1,3},{5,8},{6,12}},new int[]{0,8}));

        ToString.TwoFloorInt(problem57InsertInterval.insert(
                new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}},new int[]{4,8}));

        ToString.TwoFloorInt(problem57InsertInterval.insert(
                new int[][]{},new int[]{4,8}));

        ToString.TwoFloorInt(problem57InsertInterval.insert(
                new int[][]{{1,5}},new int[]{6,8}));

        ToString.TwoFloorInt(problem57InsertInterval.insert(
                new int[][]{{1,5}},new int[]{0,0}));

        ToString.TwoFloorInt(problem57InsertInterval.insert(
                new int[][]{{0,5},{6,8}},new int[]{3,4}));

        ToString.TwoFloorInt(problem57InsertInterval.insert(
                new int[][]{{3,5},{12,15}},new int[]{6,7}));
    }
}
