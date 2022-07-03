package com.others;

import java.util.ArrayList;
import java.util.List;

public class MsProblem3 {
    public List<Integer> mySort(List<Integer> nums1,List<Integer> nums2){
        List<Integer> result = new ArrayList<>();
        if(nums1.isEmpty()){
            return nums2;
        }else if(nums2.isEmpty()){
            return nums1;
        }
        int i=0,j=0;
        while (true){
            if(nums1.get(i)<nums2.get(j)){
                result.add(nums1.get(i));
                ++i;
                if(i==nums1.size()){
                    break;
                }
            }else {
                result.add(nums2.get(j));
                ++j;
                if(j==nums2.size()){
                    break;
                }
            }
        }
        if(i==nums1.size()){
            for (int copy =j;copy<nums2.size();++copy){
                result.add(nums2.get(copy));
            }
        }
        if(j == nums2.size()){
            for (int copy =i;copy<nums1.size();++copy){
                result.add(nums1.get(copy));
            }
        }
        return result;
    }
}
