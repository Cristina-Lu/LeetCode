package main.java.simple;

public class Problem13RomanToInteger {
    /*
    * 6ms 54%
    *
    * 40.4MB 5.56%
    */
    public int romanToInt(String s) {
        int[] list1={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] list2={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int sum=0;
        for(int j=0;j<13;){
            if(s.startsWith(list2[j])){
                s=s.substring(list2[j].length());
                 sum+=list1[j];
            }else {
                ++j;
            }
        }
        return sum;
    }
}
