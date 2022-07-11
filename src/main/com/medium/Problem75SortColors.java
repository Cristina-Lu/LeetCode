package com.medium;

public class Problem75SortColors {
    //第一版，思路不够清晰，会出现一些奇怪的本不该出现的错误
    public void sortColors1(int[] nums) {
        if(nums.length ==1){
            return;
        }
        int i = 0;
        int trueA = 0;
        int j = nums.length-1;
        int trueB = j;
        while (i <= j){
            while (nums[trueA] ==0){
                ++trueA;
                if(trueA>i){
                    i = trueA;
                }
                if(nums.length-1 == trueA){
                    return;
                }
            }
            while (nums[trueB] == 2){
                --trueB;
                if(trueB<j){
                    j = trueB;
                }
                if(trueB == 0){
                    return;
                }
            }
            if(nums[i] == 2){
                int t = nums[i];
                nums[i] = nums[trueB];
                nums[trueB] = t;
                --trueB;
                --i;
            }
            if (nums[j] == 0){
                int t = nums[j];
                nums[j] = nums[trueA];
                nums[trueA] = t;
                ++trueA;
            }
            ++i;--j;
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]+ " ");
        }
        System.out.println();
    }

    public void sortColors(int[] nums){
        int zero = 0;
        int tail = nums.length;
        int i = 0;
        while (i<tail){
            if(nums[i] == 0){
                swap(nums , i , zero);
                zero ++;
                i++;
            }else if(nums[i] == 1){
                ++i;
            }else if(nums[i] == 2){
                tail--;
                swap(nums , i ,tail);
            }
        }
    }

    private void swap(int[] nums ,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
