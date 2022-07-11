package com.difficult;

import java.util.HashMap;
import java.util.Map;

public class Problem76MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int windowFrom = 0,windowEnd = 0;
        int tempFrom = 0,tempEnd = 0;
        //对目标字符串进行统计
        Map<Character,Integer> flag = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            Character ti = t.charAt(i);
            if(flag.containsKey(ti)){
                flag.put(ti , flag.get(ti)+1);
            }else {
                flag.put(ti ,1);
            }
        }
        //滑动窗口
        for (int i = 0; i < s.length(); i++) {
            Character si = s.charAt(i);
            if(flag.containsKey(si)){
                tempEnd = i;
                flag.put(si ,flag.get(si)-1);
                if(containsAll(flag)){
                    while (true){
                        Character sF = s.charAt(tempFrom);
                        if(!flag.containsKey(sF)){
                            tempFrom++;
                        }else if( flag.get(sF)<0 ){
                            tempFrom++;
                            flag.put(sF , flag.get(sF)+1);
                        }else{
                            break;
                        }
                    }
                    if((windowEnd-windowFrom) > (tempEnd-tempFrom) || windowEnd ==0){
                        windowEnd = tempEnd;
                        windowFrom = tempFrom;
                    }
                }
            }
        }
        if(!containsAll(flag)){
            return "";
        }
        return s.substring(windowFrom ,windowEnd+1);
    }

    private boolean containsAll(Map<Character ,Integer> flag){
       for (Map.Entry<Character ,Integer> entry:flag.entrySet()){
           if(entry.getValue() > 0){
               return false;
           }
       }
       return true;
    }
}
