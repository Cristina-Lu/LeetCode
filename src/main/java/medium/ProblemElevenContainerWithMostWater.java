package main.java.medium;

public class ProblemElevenContainerWithMostWater {
    /*
    *
    * 双指针法，经典解法
    *
    * */
    public int maxArea(int[] height) {
        int max=0;
        for (int i=0,j=height.length-1;i<j;){
            if(height[i]<height[j]){
                max = Math.max(height[i]*(j-i),max);
                ++i;
            }else{
                max=Math.max(height[j]*(j-i),max);
                --j;
            }
        }
        return max;
    }


    /*
    * 485 ms 15.78%
    *39.9MB 38.57%
    * 暴力+剪枝，用当前最大容积做衡量标准，用当前最大容积与宽得到当前最小高
    * 若当前高小于最小高，则非最大容积
    */
    public int maxArea1(int[] height) {
        int max =0;
        for(int i=height.length-1;i>0;--i){
            int maxMin = 0;
            if(max!=0){
                maxMin=max/i;
            }
            for(int j=0;j+i<height.length;++j){
                int min =Math.min(height[j],height[i+j]);
                if(min>maxMin){
                    max=min*i;
                }
            }
        }
        return max;
    }
}
