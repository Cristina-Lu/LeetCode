package com.medium;

public class Problem43MultiplyStrings {

    /*
    * 竖式算法
    *   1234
    *   × 34
    * ------
    *   4936
    * +37020
    * ------
    * 41956
    *
    * */
    public String multiply1(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0"))
            return "0";
        StringBuilder reason = new StringBuilder("0");
        StringBuilder zero = new StringBuilder("");
        for (int i=num1.length()-1;i>=0;--i){
            StringBuilder result = new StringBuilder();
            result.append(0);
            StringBuilder zeroZ = new StringBuilder("");
            int sum1 = num1.charAt(i)-'0';
            for (int j = num2.length()-1; j >=0 ; --j) {
                int sum2 = num2.charAt(j)-'0';
                String t=String.valueOf(sum1*sum2)+zeroZ;
                result =add(result.toString(),t);
                zeroZ.append("0");
            }
            result.append(zero);
            zero.append("0");
            reason = add(result.toString(),reason.toString());
            System.out.println(result);
        }
        return reason.toString();
    }

    private StringBuilder add(String string1,String string2){
        StringBuilder stringBuilder = new StringBuilder();
        int up = 0;
        int max = Math.max(string1.length(),string2.length());
        for (int i = 1; i <=max ; ++i) {
            if(string1.length()>=i && string2.length()>=i){
                int sum1 = string1.charAt(string1.length()-i)-'0';
                int sum2 = string2.charAt(string2.length()-i)-'0';
                int t = (sum1+sum2+up)%10;
                up = (sum1+sum2+up)/10;
                stringBuilder.append(t);
            }else if(string1.length()<i){
                StringBuilder s =new StringBuilder(string2.substring(0,string2.length()-i+1));
                if(up!=0) {
                    s=add(s.toString(),String.valueOf(up));
                    up=0;
                }
                stringBuilder.append(s.reverse());
                break;
            }else if(string2.length()<i){
                StringBuilder s =new StringBuilder(string1.substring(0,string1.length()-i+1));
                if(up!=0){
                    s=add(s.toString(),String.valueOf(up));
                    up=0;
                }
                stringBuilder.append(s.reverse());
                break;
            }
        }
        if(up!=0){
            stringBuilder.append(up);
        }
        return stringBuilder.reverse();
    }

    /*
    * 点位计算
    *
    *
    * */

    public String multiply(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = num1.length();
        int j = num2.length();
        char[] chars = new char[i+j];
        int up =0;
        for (int k = 1; k<i+j ; ++k) {
            /*int n1=0,n2=0,n3=0,n4 = 0;
            n1=(num1.charAt(i-k)-'0')*(num2.charAt(j-k)-'0')/10;
            n2=(num1.charAt(i-k+1)-'0')*(num2.charAt(j-k)-'0')%10;
            n3=(num1.charAt(i-k-1)-'0')*(num2.charAt(j-k+1)-0)/10;
            n4=(num1.charAt(i-k)-'0')*(num2.charAt(j-k+1)-'0');*/

            int sum=0;
            for (int m=0;m<j;++m){
                sum+=(num1.charAt(i-k-m)-'0')*(num2.charAt(j-k+m))/10;
            }
       }
        return stringBuilder.toString();
    }
}
