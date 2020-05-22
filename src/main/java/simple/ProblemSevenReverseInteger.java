package main.java.simple;

public class ProblemSevenReverseInteger {
    /*
    * 1ms 100%
    *
    * 37.1Mb 5.33%
    * */
    public int reverse(int x) {

        Long max =Long.valueOf(2147483647);
        int min =-2147483648;
        boolean isCorrect = true;
        if(x==min)return 0;
        if(x<0){
            isCorrect = false;
            x=-x;
        }
        long rev =0;
        for (int i=0;x!=0;++i){
            rev=rev*10+x%10;
            x/=10;
            if(i==9 &&(isCorrect&&rev>max ||!isCorrect &&rev>max+1)){
                return 0;
            }
        }
        if(!isCorrect)rev=-rev;
        return (int)rev;
    }
}
