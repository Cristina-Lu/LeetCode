package com.medium;

import java.util.Arrays;

public class Problem56MergeIntervals {
    public int[][] merge(int[][] intervals) {
        //按区间左端点进行排序
        Arrays.sort(intervals,(o1,o2)->{return o1[0]-o2[0];});
        int num=0;//前区间位置
        for(int i=1;i<intervals.length;++i){
            if(intervals[i][0]<=intervals[num][1]){//当当前区间左端点小于前区间右端点，说明两个区间可以合并
                if(intervals[i][1]>intervals[num][1]) {//如果当前区间右端点大于前区间右端点
                    intervals[num][1]=intervals[i][1];
                }
            }else {//如果当前区间左端点大于前区间右端点，说明两个区间无法合并，则增加一个新的区间
                intervals[num+1]=intervals[i];
                num++;
            }
        }
        //将合并后的区间返回
        int[][] res = new int[num+1][2];
        for (int i=0;i<=num;++i){
            res[i]=intervals[i];
        }
        return res;
    }
}
