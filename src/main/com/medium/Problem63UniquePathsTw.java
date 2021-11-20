package com.medium;

public class Problem63UniquePathsTw {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(obstacleGrid[i][j]==0){
                    if(i==0 ){
                        int t;
                        if(j==0)
                            t=1;
                        else
                            t= obstacleGrid[i][j-1];
                        obstacleGrid[i][j]=t;
                    }else if(j==0){
                        obstacleGrid[i][j]=obstacleGrid[i-1][j];
                    }else {
                        obstacleGrid[i][j] =
                                obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                    }
                }else {
                    obstacleGrid[i][j]=0;
                }
            }
        }
        return obstacleGrid[m-1][n-1];
    }
}
