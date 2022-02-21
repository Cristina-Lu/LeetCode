package com.difficult;

public class Problem72EditDistance {
    /*
    * 给你两个单词 word1 和 word2， 请返回将 word1 转换成 word2 所使用的最少操作数  。
    * 你可以对一个单词进行如下三种操作：
    *     插入一个字符
    *     删除一个字符
    *     替换一个字符
    *
    * 动态规划问题，通过二维数组记录每个变更的最小距离，而后得到整体最小距离
    * dp[i][j]为word1[0-i]转换为word[0-j]的最小距离
    *
    * 暂未解决
    * */

    public int minDistance(String word1, String word2) {
        if(word1.length()==0 || word2.length()==0){//对原始数据为空串进行处理
            return word1.length()==0?word2.length():word1.length();
        }
        int[][] dp=new int[word1.length()][word2.length()];
        for (int i=0;i<word1.length();++i){
            for (int j=0;j<word2.length();++j){
                if(word1.charAt(i)==word2.charAt(j)){//如果当前讨论的值相同，则无需操作即可
                    if (i != 0 && j != 0) {
                        dp[i][j] = Math.min(dp[i - 1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                        if(word2.charAt(j)==word2.charAt(j-1)){
                            dp[i][j]++;
                        }
                    } else if (i != 0) {
                        dp[i][j] = dp[i - 1][j];
                    }else if(j!=0){
                        dp[i][j]= dp[i][j-1];
                        if(word2.charAt(j)==word2.charAt(j-1)){
                            dp[i][j]++;
                        }
                    }else {
                        dp[i][j]=0;
                    }
                }else {//如果当前讨论的值不同，则需插入、删除或替换一个字符，操作步数+1
                    if (i != 0 && j != 0) {
                        dp[i][j] = Math.min(dp[i - 1][j],Math.min(dp[i][j-1],dp[i-1][j-1])) + 1;
                    } else if (i != 0) {
                        dp[i][j] = dp[i - 1][j] + 1;
                    }else if(j!=0){
                        dp[i][j] = dp[i][j-1] + 1;
                    }else {
                        dp[i][j]=1;
                    }
                }
            }
        }
        return dp[word1.length()-1][word2.length()-1];
    }
}
