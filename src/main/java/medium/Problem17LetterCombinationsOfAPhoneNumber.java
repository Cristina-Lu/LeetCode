package java.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem17LetterCombinationsOfAPhoneNumber {
    /*
    * 7ms 36.89%
    * 40M 5.17%
    *
    * */
    public List<String> letterCombinations(String digits) {

        List<String>myList= new ArrayList<String>();
        if(digits.length()==0)return myList;
        Map<Integer,String> phoneNumberMap=new HashMap<>();
        phoneNumberMap.put(2,"abc");
        phoneNumberMap.put(3,"def");
        phoneNumberMap.put(4,"ghi");
        phoneNumberMap.put(5,"jkl");
        phoneNumberMap.put(6,"mno");
        phoneNumberMap.put(7,"pqrs");
        phoneNumberMap.put(8,"tuv");
        phoneNumberMap.put(9,"wxyz");
        String next="";
        string(digits,0,next,phoneNumberMap,myList);
        return myList;
    }

    private void string(String digits,int m,String next,Map<Integer,String> phoneNumbers,List<String>myList){
        if(digits.length()>m){
            String sm=phoneNumbers.get(digits.charAt(m)-'0');
            for(int i=0;i<sm.length();++i){
                next+=sm.charAt(i);
                string(digits,m+1,next,phoneNumbers,myList);
                next=next.substring(0,next.length()-1);
            }
        }else {
            myList.add(next);
        }
    }
}
