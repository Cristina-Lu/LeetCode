package main.java.simple;

public class Problem27RemoveElement {
    /*
    * 0ms 100%
    *
    * 38.1MB 5.68%
    * */
    public int removeElement(int[] nums, int val) {
        int size=nums.length;
        int now=0;
        for(int i=0;i<nums.length;++i){
            if(nums[i]!=val){
                nums[now]=nums[i];
                ++now;
            }else {
                --size;
            }
        }
        return size;
    }
}
