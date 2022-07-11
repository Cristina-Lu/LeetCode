package com.medium;

import org.junit.Test;

public class Problem75SortColorsTest {
    @Test
    public void test(){
        Problem75SortColors problem75SortColors = new Problem75SortColors();
        int[] t1 = {2,0,1,2,1,0,0,2,1};
        problem75SortColors.sortColors(t1);

        int[] t2 = {0,0};
        problem75SortColors.sortColors(t2);

        int[] t3 = {2,0,1};
        problem75SortColors.sortColors(t3);

        int[] t4 = {0,0,1,0,1,1};
        problem75SortColors.sortColors(t4);
    }
}
