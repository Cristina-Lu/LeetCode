package com.medium;

import java.util.*;

public class Problem49GroupAnagrams {
    //初版方案
    public List<List<String>> groupAnagrams1(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<Integer>> flagMap = new HashMap<>();
        for (String s:strs){
            //处理特殊字符串 空字符串
            if("".equals(s)){
                if(flagMap.containsKey("0A0")){
                    result.get(flagMap.get("0A0").get(0)).add("");
                }else {
                    Integer place = result.size();
                    List<Integer> placeList = new ArrayList<>();
                    placeList.add(place);
                    flagMap.put("0A0",placeList);
                    List<String> stringList = new ArrayList<>();
                    stringList.add(s);
                    result.add(stringList);
                }
                continue;
            }
            //获取字符串中的字符
            String[] myString = s.split("");
            Arrays.sort(myString);
            //计算字符串的ACSII码的和
            int sum=0;
            for(String m:myString){
                sum+=m.charAt(0)-'a'+1;
            }
            //获取该字符串的自定义哈希值（前面为字符串的长度，后面为ACSII码的和）
            StringBuilder key = new StringBuilder(String.valueOf(s.length()));
            key.append("A").append(sum);
            //确认当前是否有该自定义哈希值的记录
            if(flagMap.containsKey(key.toString())){
                Boolean flag= true;
                List<Integer> myList = flagMap.get(key.toString());
                for (Integer integer:myList){
                    flag=true;
                    String theString=result.get(integer).get(0);
                    String[] theStrings =theString.split("");
                    Arrays.sort(theStrings);
                    for(int i=0;i<theStrings.length;++i){
                        if(!theStrings[i].equals(myString[i])){
                            flag=false;
                            break;
                        }
                    }
                    if(flag){
                        result.get(integer).add(s);
                        break;
                    }
                }
                if(!flag){
                    Integer place = result.size();
                    List<Integer> placeList = flagMap.get(key.toString());
                    placeList.add(place);
                    flagMap.put(key.toString(),placeList);
                    List<String> stringList = new ArrayList<>();
                    stringList.add(s);
                    result.add(stringList);
                }
            }else {
                Integer place = result.size();
                List<Integer> placeList = new ArrayList<>();
                placeList.add(place);
                flagMap.put(key.toString(),placeList);
                List<String> stringList = new ArrayList<>();
                stringList.add(s);
                result.add(stringList);
            }
        }
        return result;
    }

    //优化key方案
    public List<List<String>> groupAnagrams2(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,Integer>flagMap= new HashMap<>();
        for(String s:strs){
            //确认key
            char[] strings = s.toCharArray();
            Arrays.sort(strings);
            String key = new String(strings);
            if(flagMap.containsKey(key)){
                result.get(flagMap.get(key)).add(s);
            }else {
                flagMap.put(key,result.size());
                List<String> stringList = new ArrayList<>();
                stringList.add(s);
                result.add(stringList);
            }
        }
        return result;
    }

    //思路优化
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>>flagMap= new HashMap<>();
        for(String s:strs){
            //确认key
            char[] strings = s.toCharArray();
            Arrays.sort(strings);
            String key = new String(strings);
            if(!flagMap.containsKey(key)){
                flagMap.put(key,new ArrayList<String>());
            }
            flagMap.get(key).add(s);
        }
        return new ArrayList<List<String>>(flagMap.values());
    }
}
