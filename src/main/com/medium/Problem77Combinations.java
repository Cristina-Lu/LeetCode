package com.medium;

import java.util.ArrayList;
import java.util.List;

public class Problem77Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(n,k,1,result,new ArrayList<>());
        return result;
    }
    private void dfs(int n , int k, int start ,List<List<Integer>> result,List<Integer> nowResult){
        if(nowResult.size() == k){
            result.add(new ArrayList<>(nowResult));
            return;
        }
        for (int i = start; i <= n-(k-nowResult.size())+1; i++) {
            nowResult.add(i);
            dfs(n,k,i+1,result,nowResult);
            nowResult.remove(new Integer(i));
        }
    }
}
