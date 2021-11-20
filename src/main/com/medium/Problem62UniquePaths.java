package com.medium;

public class Problem62UniquePaths {
    //动态规划，因为每条路都要重新计算所有经过的格子，所以超时
    public int uniquePaths1(int m, int n) {
        if(m==2 )
            return n;
        else if(n==2)
            return m;
        else if(m==1 || n==1)
            return 1;
        else
            return uniquePaths1(m-1,n)+uniquePaths1(m,n-1);
    }

    //反向思维，从正常的表格思维开始，从起始点开始进行后续计算，直至重点
    public int uniquePaths(int m,int n){
        int[][] nums = new int[m][n];
        for(int i=0;i<m;++i){
            for (int j=0;j<n;++j){
                if(i==0 || j ==0) {
                    nums[i][j] = 1;
                }else {
                    nums[i][j]=nums[i][j-1]+nums[i-1][j];
                }
            }
        }
        return nums[m-1][n-1];
    }

    //最优解 将现有列与上一列合并，因为当前有效列其实只有前一列，以及记录的当前列，所以可以实现合并
    public int uniquePaths2(int m, int n) {
        int[] res=new int[n];
        res[0]=1;
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                res[j]=res[j]+res[j-1];
            }
        }
        return res[n-1];
    }
}
