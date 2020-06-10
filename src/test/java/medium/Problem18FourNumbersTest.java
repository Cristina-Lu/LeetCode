package test.java.medium;

import main.java.medium.Problem18FourNumbers;
import org.junit.Test;

public class Problem18FourNumbersTest {
    @Test
    public void test(){
        Problem18FourNumbers problem18FourNumbers
                =new Problem18FourNumbers();
        //int[] my={1, 0, -1, 0, -2, 2}; int target = 0;//[[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]
        //int[] my={0,0,0,0}; int target = 0;//[[0, 0, 0, 0]]
        //int[] my={-3,-2,-1,0,0,1,2,3}; int target = 0;//[[-3, -2, 2, 3], [-3, -1, 1, 3], [-3, 0, 0, 3], [-3, 0, 1, 2], [-2, -1, 0, 3], [-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]
        //int[] my={0,0,4,-2,-3,-2,-2,-3}; int target = -1;//[[-3, -2, 0, 4]]
        //int[] my={0,0,4,-2,-3,-2,-2,-3}; int target = 0;//[[-3, -2, 0, 4]]
        int[] my={1,0,-1,0,-2,2}; int target=0;

        System.out.println(problem18FourNumbers.fourSum(my,target));
    }
}
