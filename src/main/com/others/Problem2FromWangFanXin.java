package com.others;

import java.util.ArrayList;
import java.util.List;

public class Problem2FromWangFanXin {
    public List<Integer> statistic(List<Integer> list){
        int num=list.size()/10;
        //对容器中数字进行统计，并找到最小值minValue
        int[] flag =new int[100];
        Integer minValue = new Integer(101);
        for (Integer inte: list) {
            flag[inte] = ++flag[inte];
            if(minValue>inte){
                minValue = inte;
            }
        }
        //舍弃前10%并找到最大值
        int sum =0;
        int i = flag.length-1;
        boolean maxFlag = false;
        for (; i >= 0; --i) {//退出循环时flag[i]为舍弃后的最大值
            if (!maxFlag) {
                sum += flag[i];
                if (sum > num) {
                    //当统计值超过前10%时，确定当前值为舍弃后的最大值
                    flag[i] = sum - num;
                    break;
                } else if (sum == num) {
                    //当统计值刚好等于前10%时，舍弃后的最大值为下一个非零统计值
                    maxFlag = true;
                    --i;
                }
            } else if (maxFlag) {
                if (flag[i] != 0)//当统计值刚好等于前10%时，下一个非零统计值为舍弃后的最大值
                    break;
            }
        }
        //划分区间
        Integer[] regions = new Integer[10];
        int region = (i-minValue)/9;
        int re = (i-minValue)%9;
        for (int j=0,res =0;j<10;++j){
            regions[j]= minValue+region*j+res;
            if(res<re){
                ++res;
            }
        }
        //统计区间内数量
        List<Integer> result = new ArrayList<>();
        int minRegion = regions[8];
        int regionSum =0;
        for (; i>=minValue ;--i) {
            regionSum += flag[i];
            if(i==minRegion){
                result.add(Integer.valueOf(regionSum));
                if(result.size()==9)
                    break;
                regionSum = 0;
                minRegion = regions[8-result.size()];
            }
        }
        return result;
    }
}
