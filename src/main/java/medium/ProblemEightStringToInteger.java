package main.java.medium;

public class ProblemEightStringToInteger {
    /*
    * 2ms 99.5%
    *
    * 40M 5.77%
    * */
    public int myAtoi(String str) {
        long t = 0;
        int max = 2147483647;
        int min =-2147483648;
        boolean right = true;
        boolean flagR = true;
        Boolean flagN = true;
        char[] myStr = str.toCharArray();
        for(char myS :myStr){
            if(flagR &&flagN && myS =='+'){
                flagR =false;
                if(flagN)flagN = !flagN;
            }else if(flagR &&flagN && myS =='-'){
                right = false;
                flagR = false;
                if(flagN)flagN = !flagN;
            }else if(flagN && myS==' ' ){
                continue;
            }else if(myS>='0'&&myS<='9'){
                t = t*10 +myS-'0';
                if(flagN)flagN = !flagN;
                if(right&&t>max)return max;
                else if(!right && -t<min)return min;
            }else {
                break;
            }
        }
        if(t!=0){
            if(right)
                return (int)t;
            else{
                return (int)-t;
            }
        }
        else {
            return 0;
        }
    }
}
