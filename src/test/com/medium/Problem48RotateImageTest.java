package com.medium;

import org.junit.Test;

public class Problem48RotateImageTest {
    @Test
    public void test(){
        Problem48RotateImage problem48RotateImage
                = new Problem48RotateImage();
        problem48RotateImage.rotate(new int[][]{{1,2,3},{4,5,6,},{7,8,9}});
        problem48RotateImage.rotate(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
    }
}
