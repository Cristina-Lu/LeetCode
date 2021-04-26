package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 与39题的区别在于该题目给出的数组有重复数字，但组合中的数字每个都只能使用一次，即可能会出现重复组合的答案，
* 但题目中不允许重复答案出现
* 所以该题最重要的是进行剪枝
*
* */
public class Problem40CombinationSumTwice {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //对数据进行排序，方便剪枝
        Arrays.sort(candidates);
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates,target,0,path,res);
        return res;
    }

    /*
    执行用时：1130 ms, 在所有 Java 提交中击败了5.01%的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了52.06%的用户

    总结:太暴力了，去重方法太暴力了
    */
    private void dfs1(int[] candidates,int target,int place,List<Integer> path,List<List<Integer>>res){

        for(int i = place;i < candidates.length;++i){
            boolean flag = false;
            target = target-candidates[i];
            path.add(candidates[i]);
            if(target>0){

                dfs(candidates,target,i+1,path,res);//place剪枝
                //该算法下，会优先搜索较小元素
                // 所以在用较大元素搜索时可以从当前元素出发而非还从原元素集合出发
            }else if(target == 0){
                if(!res.contains(path)){//暴力去重
                res.add(new ArrayList<>(path));}//这里不能直接add（path）
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

    /*
   执行用时：3 ms, 在所有 Java 提交中击败了83.71%的用户
   内存消耗：38.5 MB, 在所有 Java 提交中击败了81.05%的用户
   */
    private void dfs(int[] candidates,int target,int place,List<Integer> path,List<List<Integer>>res){

        for(int i = place;i < candidates.length;++i){
            if(i>place&&candidates[i]==candidates[i-1])
                continue;
            boolean flag = false;
            target = target-candidates[i];
            path.add(candidates[i]);
            if(target>0){
                dfs(candidates,target,i+1,path,res);//place剪枝
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
