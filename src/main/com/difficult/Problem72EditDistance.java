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
    * dp[i][j]为word1[0-i]转换为word[0-j]的最小距离 minDistance
    *
    * 暂未解决
    * */

    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        int[][] dp = new int[len1 + 1][len2 + 1];

        // 插入操作
        for(int i = 1; i <= len1; i++) {
            dp[i][0] = dp[i - 1][0] + 1;
        }

        // 删除操作
        for(int j = 1;j <= len2; j++) {
            dp[0][j] = dp[0][j - 1] + 1;
        }

        for(int i = 1; i <= len1; i++) {
            for(int j = 1; j <= len2; j++) {
                // 删除操作：dp[i - 1][j]
                // 增加操作：dp[i][j - 1]
                // 替换操作：dp[i - 1][j - 1]
                dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1;

                if(word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1]);
                }
            }
        }

        return dp[len1][len2];
    }
}



