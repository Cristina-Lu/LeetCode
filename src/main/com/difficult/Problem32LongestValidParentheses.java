package com.difficult;

public class Problem32LongestValidParentheses {
    /*
    *
    * 标记法，待更新动态规划法
    *
    * */
    public int longestValidParentheses(String s) {
        int sum = 0;
        int[] sSum = new int[s.length()] ;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='('){
                sSum[i]=1;
            }else{
                sSum[i] = 1;
                for (int j = i-1; j >=0 ; j--) {
                    if(sSum[j]==1 && s.charAt(j) == '('){
                        sSum[i]=0;
                        sSum[j]=0;
                        break;
                    }
                }
            }

        }
        int max = 0;
        for (int i = 0; i <s.length() ; i++) {
            if(sSum[i] == 0){
                ++sum;
            }else {
                if(max < sum){
                    max = sum;
                }
                sum = 0;
            }
        }
        if(max < sum){
            max = sum;
        }
        return max ;
    }
}
