package test.java.medium;

import main.java.medium.Problem16ThreeNumbersClosest;
import org.junit.Test;

public class Problem16ThreeNumbersClosestTest {
    @Test
    public void tests(){
        Problem16ThreeNumbersClosest problem16ThreeNumbersClosest
                =new Problem16ThreeNumbersClosest();
       /* int[] nums = {-1, 0, 1, 2, -1, -4};
        int target=0;//return 0;*/
        /*int[]nums={-1,2,1,-4};
        int target=1; //return 2*/
       /*int[] nums={0,2,1,-3};
       int target=1;return 0*/
       /* int[] nums={1,1,-1,-1,3};
        int target=-1;//return -1*/
        /*int[] nums={1,2,4,8,16,32,64,128};
        int target=82;*/
        /*[13,2,0,-14,-20,19,8,-5,-13,-3,20,15,20,5,13,14,-17,-7,12,-6,0,20,-19,-1,-15,-2,8,-2,-9,13,0,-3,-18,-9,-9,-19,17,-14,-19,-4,-16,2,0,9,5,-7,-4,20,18,9,0,12,-1,10,-17,-11,16,-13,-14,-3,0,2,-18,2,8,20,-15,3,-13,-12,-2,-19,11,11,-10,1,1,-10,-2,12,0,17,-19,-7,8,-19,-17,5,-5,-10,8,0,-12,4,19,2,0,12,14,-9,15,7,0,-16,-5,16,-12,0,2,-16,14,18,12,13,5,0,5,6]
-59*/
        int[]nums={13,2,0,-14,-20,19,8,-5,-13,-3,20,15,20,5,13,14,-17,-7,12,-6,0,20,-19,-1,-15,-2,8,-2,-9,13,0,-3,-18,-9,-9,-19,17,-14,-19,-4,-16,2,0,9,5,-7,-4,20,18,9,0,12,-1,10,-17,-11,16,-13,-14,-3,0,2,-18,2,8,20,-15,3,-13,-12,-2,-19,11,11,-10,1,1,-10,-2,12,0,17,-19,-7,8,-19,-17,5,-5,-10,8,0,-12,4,19,2,0,12,14,-9,15,7,0,-16,-5,16,-12,0,2,-16,14,18,12,13,5,0,5,6};
        int target=-59;
        System.out.println(problem16ThreeNumbersClosest.threeSumClosest(nums,target));
    }
}
