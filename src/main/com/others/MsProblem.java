package com.others;


public class MsProblem {
    public int[] huadong(int[]nums,int k){
        if(nums.length<k){
            return null;
        }
        if(nums.length==0){
            return null;
        }
        int[] result = new int[nums.length-k+1];
        int[] nowKey = new int[k];
        int max = nums[0];
        int maxi = 0;
        for(int i =0;i<k;++i){
            if(nums[i]>max){
                max = nums[i];
                maxi = i;
            }
            nowKey[i] =nums[i];
        }
        result[0] =max;
        for(int i=k;i<nums.length;++i){
            nowKey[i%k] =nums[i];
            if(nums[i]>=max){
                max =nums[i];
                maxi = i%k;
            }else {
                if(maxi<i-k+1){
                    max=nowKey[0];
                    for (int j=0;j<nowKey.length;++j){
                        if(nowKey[j]>max){
                            max = nowKey[j];
                            maxi = j;
                        }
                    }
                }
            }
            result[i-k+1] = nowKey[maxi];
        }
        return result;
    }

    /*class myDeque{
        int value;
        myDeque left;
        myDeque right;
        int size = 0;

        public myDeque(int value){
            this.value =value;
            size =0;
        }

        public myDeque add(int value){
            size++;
            *//*较大堆*//*
            if(this.value>value){
                if(this.left ==null){
                    this.left = new myDeque(value);
                }else if(this.right == null){
                    this.right = new myDeque(value);
                }else if(this.left.size>this.right.size){

                }
            }
        }
    }*/
}
