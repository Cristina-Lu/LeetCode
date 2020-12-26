package com.simple;


public class ProblemNinePalindromeNumber {


    /*
    * 他山之石，亮点：
    * 1、末尾为0直接返回false
    * 2、当转换到中间位的时候就可以结束转换了
    * */
    public boolean isPalindrome(int x) {
        //思考：这里大家可以思考一下，为什么末尾为 0 就可以直接返回 false
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }

    /*
     *9ms 99.22%
     *38.6M 5.14%
     * */
    public boolean isPalindrome2(int x) {
        boolean flag=false;
        if(x<0)return flag;
        int xp = 0;
        int xre = x;
        while (x !=0){
            xp = xp *10+(x%10);
            x = x/10;
        }
        return xre ==xp;
    }
    /*
    * 10ms 69.40%
    *38.6M 5.14%
    * */
    public boolean isPalindrome1(int x) {
        boolean flag=false;
        if(x<0)return flag;
        int xp = 0;
        int xre = x;
        while (x !=0){
            xp = xp *10+(x%10);
            x = x/10;
        }
        if(xp == xre){
            flag = true;
        }
        return flag;
    }
}
