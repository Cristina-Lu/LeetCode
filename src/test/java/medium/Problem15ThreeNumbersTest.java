package test.java.medium;

import main.java.medium.Problem15ThreeNumbers;
import org.junit.Test;

public class Problem15ThreeNumbersTest {
    @Test
    public void test(){
        Problem15ThreeNumbers problem15ThreeNumbers
                =new Problem15ThreeNumbers();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(problem15ThreeNumbers.threeSum(nums));
    }
}
