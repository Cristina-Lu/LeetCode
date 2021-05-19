package com.difficult;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Problem42TrappingRainWater {
    /*
    * 有问题，height2测试用例无法通过
    *
    * 问题缘由为中间节点相较于双边更短，如4，2，3，2，5
    * 该算法只能按 【4，2，3】 、【3，2，5】计算
    * 但实际上应该按照【4，……，3，……，5】计算
    *
    * */
    public int trap1(int[] height) {
        int size=0;
        int left=0,right=0;
        for (int i = 1; i <height.length ; i++) {
            if(height[i-1]<height[i] && ((i<height.length-1 && height[i]>height[i+1])||(i==height.length-1))){
                int min=height[left]<height[i]?height[left]:height[i];
                for(int j=left+1;j<i;++j){
                    size+=min-height[j];
                }
                left=i;
            }
        }
        return size;
    }

    public int trap(int[] height) {
        int size=0;
        int left=0,right=height.length-1,leftMax=0,rightMax=0;
        while (true){
            if(left!=right){
            if (height[left]<=height[right]){
                if(height[left]>leftMax){
                    leftMax=height[left];
                }else {
                    size+=leftMax-height[left];
                }
                left++;
            }else {
                if(height[right]>rightMax){
                    rightMax=height[right];
                }else {
                    size+=rightMax-height[right];
                }
                right--;
            }}else {
                break;
            }
        }

        return size;
    }
}
