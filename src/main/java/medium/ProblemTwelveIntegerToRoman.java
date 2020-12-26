package java.medium;

public class ProblemTwelveIntegerToRoman {
    /*
    * 6ms 55.25%
    * 39.7M 5.55%
    * */
    public String intToRoman(int num) {
        int[] list1={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] list2={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String m="";
        for(int i=0;i<13;++i){
            if(num>=list1[i]){
                m=m+list2[i];
                num-=list1[i];
                --i;
            }
        }
        return m;
    }
}
