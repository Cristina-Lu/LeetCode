package com.medium;

import java.util.HashMap;
import java.util.Map;

public class ProblemThreeLongestSubstringWithoutRepeatingCharacters {

    /*
    * 第三版，参照前辈答案版
    * 时间复杂度  4ms 91.16%
    * 空间复杂度40.1Mb  5.20%
    * 时间复杂度已经不能从改变校验是否重复的规则上进行降低了
    * 通过对判断大小的算法的改变缩小时间复杂度
    *
    *
    * */
    public int lengthOfLongestSubstring(String s) {

        if("".equals(s))return 0;
        if(s.length()==1)return 1;
        int maxLength=0;
        int startPlace=1;
        int[] place=new int[128];
        for(int nowPlace=0,i=0;nowPlace<s.length();++nowPlace){
            i=Math.max(place[s.charAt(nowPlace)],i);
            maxLength=Math.max(maxLength,nowPlace-i+1);
            place[s.charAt(nowPlace)]=nowPlace+1;
        }
        return maxLength;
    }

    /*
    * 第二版
    * 时间复杂度 8ms  73，59%
    * 空间复杂度40.1Mb  5.20%
    * 运用map的特性检查前串中是否有重复字符
    * */
    public int lengthOfLongestSubstring2(String s) {
        Map<Character, Integer>map =new HashMap<>();
        int startPlace =0;
        int oldPlace=0;
        int maxlength = 0;
        for(int nowPlace=0;nowPlace<s.length();++nowPlace){
            if(map.containsKey(s.charAt(nowPlace))){
            oldPlace=map.get(s.charAt(nowPlace));
            if(oldPlace>=startPlace){
            startPlace=oldPlace+1;
            }
            }
            map.put(s.charAt(nowPlace),nowPlace);

            if (nowPlace-startPlace+1>maxlength){
                maxlength=nowPlace-startPlace+1;
            }
        }
        //System.out.println(maxlength);
        return maxlength;
    }

    /*
    * 第一版  时间复杂度12ms  39.66%
    * 空间复杂度 40.1M  5.20%
    *
    * */
    public int lengthOfLongestSubstring1(String s) {
         int startPlace=0;
        //int endPlace=0;
        int maxLength=0;
        for(int nowPlace=0;nowPlace<s.length();++nowPlace){
            char nowChar=s.charAt(nowPlace);
            for(int circulate =startPlace;circulate<nowPlace;++circulate){
                if(circulate==nowPlace)continue;
                char nowCirculate=s.charAt(circulate);
                if(nowChar==nowCirculate){
                    startPlace=circulate+1;
                }
            }
            if(nowPlace-startPlace+1>maxLength){
                maxLength=nowPlace-startPlace+1;
            }
        }
        System.out.println(maxLength);
        return 0;
    }
}
