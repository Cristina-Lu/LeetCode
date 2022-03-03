package com.difficult;

import java.util.LinkedList;

public class Problem239SlidingWindowMaximum {
    /*
    * 双向链表实现滑动窗口内最大值
    *
    * LinkedList即Java中实现的滑动窗口
    *
    * 思路：维护一个双向链表，插入排序当前窗口的最大值
    * */
    public int[] maxSlidingWindow(int[] nums, int k) {

        LinkedList<Integer> list = new LinkedList();
        int[] result = new int[nums.length-k+1];
        for (int i=0;i<nums.length;++i){
            if(i>=k){
                result[i-k] = list.getFirst();
                list.remove(new Integer(nums[i-k]));
            }
            int size = list.size();
            for (int j=0;j<list.size();++j){
                if(list.get(j)<nums[i]){
                    list.add(j,nums[i]);
                    break;
                }
            }
            if(list.size()==size){
                list.add(nums[i]);
            }

        }
        result[result.length-1] = list.getFirst();
        return result;
    }
}
