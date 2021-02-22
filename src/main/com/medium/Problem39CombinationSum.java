package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem39CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //对数据进行排序，方便剪枝
        Arrays.sort(candidates);
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates,target,0,path,res);
        return res;
    }

    private void dfs(int[] candidates,int target,int place,List<Integer> path,List<List<Integer>>res){
        for(int i = place;i < candidates.length;++i){
            boolean flag = false;
            target = target-candidates[i];
            path.add(candidates[i]);
            if(target>0){
                dfs(candidates,target,i,path,res);//place剪枝
                //该算法下，会优先搜索较小元素
                // 所以在用较大元素搜索时可以从当前元素出发而非还从原元素集合出发
            }else if(target == 0){
                res.add(new ArrayList<>(path));//这里不能直接add（path）
                // 直接add是浅复制，path改变的时候res中的对应值也会改变
                flag = true;
            }else {
                flag =true;
            }
            target += candidates[i];
            path.remove(Integer.valueOf(candidates[i]));//这里不能直接remove candidates[i]
            //直接remove会被判定是移除该位置元素而非移除该元素，当List<Integer>类型时应注意
            if(flag){
                i = candidates.length-1;//剪枝，较小元素相加等于或大于目标值时，换大元素无意义，遂剪枝
            }
        }
    }

}
