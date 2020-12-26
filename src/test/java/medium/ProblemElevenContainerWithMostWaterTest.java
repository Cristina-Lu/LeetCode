package java.medium;

import org.junit.Test;

public class ProblemElevenContainerWithMostWaterTest {
    @Test
    public void tests(){
        ProblemElevenContainerWithMostWater problemElevenContainerWithMostWater
                =new ProblemElevenContainerWithMostWater();
        int[]height ={1,8,6,2,5,4,8,3,7};
        //int[]height ={0,2};
        //int[]height={0,0,2,0,};
        System.out.println(problemElevenContainerWithMostWater.maxArea(height));
    }
}
