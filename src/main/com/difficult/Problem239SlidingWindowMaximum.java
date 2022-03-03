package com.difficult;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Problem239SlidingWindowMaximum {
    /*
    * 双向链表实现滑动窗口内最大值

    * */

    /*
    *  LinkedList即Java中实现的滑动窗口
    *  思路：维护一个双向链表，插入排序当前窗口的最大值
    *
    *  超时
    * */
    public int[] maxSlidingWindow1(int[] nums, int k) {

        LinkedList<Integer> list = new LinkedList();
        int[] result = new int[nums.length-k+1];
        for (int i=0;i<nums.length;++i){
            if(i>=k){
                result[i-k] = list.getFirst();
                list.remove(new Integer(nums[i-k]));
            }
            int size = list.size();
            for (int j=0;j<list.size();++j){
                //插入排序
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

    /*
    * 使用最小堆，并记录每个节点的位置，使用懒加载原则，在不影响结果的情况下不调整堆结构
    * */
    public int[] maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<Integer[]> list = new PriorityQueue<Integer[]>(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0]!=o2[0]?o2[0]-o1[0]:o2[1]-o1[1];
            }
        });
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; ++i) {
            if (i >= k) {
                while (list.peek()[1]<i-k){
                    list.poll();
                }
                result[i - k] = list.peek()[0];
            }
            list.add(new Integer[]{nums[i],i});
        }
        while (list.peek()[1]<nums.length-k){
            list.poll();
        }
        result[result.length-1] = list.peek()[0];
        return result;
    }


}
