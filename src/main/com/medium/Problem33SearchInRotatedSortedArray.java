package com.medium;

public class Problem33SearchInRotatedSortedArray {
    //该方法是建立在数组折点前后一定会有值的情况，没考虑边界的无值情况
    public int search1(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        int test = nums[0],tLeft = left,tRight = right,aim=-1;
        //对只有一个元素的数组做特殊处理
        if(right == 0){
            if(nums[0] == target)
                return 0;
            else
                return -1;
        }
        //对只有两个元素的数组做特殊处理
        if(right == 1){
            if(nums[0] == target){
                return 0;
            }
            if (nums[1] == target){
                return 1;
            }
            return -1;
        }
        //二分法找到折点
        while (tLeft<tRight){
            aim = (tLeft+tRight)/2;
            if(aim+1<nums.length && nums[aim-1]>nums[aim]){
                break;
            }else if(nums[aim]>test){
                tLeft = aim;
            }else if(nums[aim]<test){
                tRight = aim;
            }
        }
        if(test<target){
            right = aim-1;
        }else if(test>target){
            if(target == nums[aim])
                return aim;
            left = aim;
        }else {
            return 0;
        }
        if(target>nums[aim-1]){
            return -1;
        }
        aim = -1;
        while (left+1 < right){
            aim = (left + right)/2;
            if(nums[aim]<target){
                left =aim;
            }else if(nums[aim]>target){
                right = aim;
            }else {
                break;
            }
        }
        if(left+1 >= right)
            return -1;
        else
            return aim;
    }

    //通过，但内存消耗较大
    public int search2(int[] nums, int target){
        //对两个元素的数组做特殊处理
        if(nums.length == 2 ){
            if(nums[0] == target){
                return 0;
            }else if(nums[1] == target){
                return 1;
            }else {
                return -1;
            }
        }
        //定义返回值，即目标数值所在位置的初始值
        int aim =-1;
        //定义数组端节点
        int left = 0;int right = nums.length-1;
        //判断数组折点前后是否有值
        if(nums[left] > nums[right]){//折点前后有值，找到折点，按两个升序数组处理
            int tLeft = 0,tRight = nums.length-1;
            //二分法找到折点
            while (tLeft+1<tRight){
                aim = (tLeft+tRight)/2;
                if(aim+1<nums.length && nums[aim-1]>nums[aim]){
                    break;
                }else if(nums[aim]>nums[0]){
                    tLeft = aim;
                }else if(nums[aim]<nums[0]){
                    tRight = aim;
                }
            }
            if(tLeft+1 == tRight)
                aim = aim+1;
            //确定目标所在数组（前一个数组中，后一个数组中，不在数组中）
            if(target>nums[0] && target<nums[aim-1]){
                right = aim-1;
            }else if(target >nums[aim] && target <nums[nums.length-1]){
                left = aim;
            }else if (target == nums[0]){
                return 0;
            }else if(target == nums[aim-1]){
                return aim-1;
            }else if (target == nums[aim]){
                return aim;
            }else if(target == nums[nums.length-1]){
                return nums.length-1;
            }else {
                //目标值不在数组范围内
                return -1;
            }
            }else {//因题目限制不会有重复元素，遂不对两者相等做限制
            //折点前后无值的话，按一般升序数组处理
                //二分法限制条件确定（有序数组，目标在数组范围内）
                if(target <nums[0] || target >nums[nums.length-1]){
                    //若target不在数组范围内，则说明该数组内无所要找的值，直接结束流程即可
                    return -1;
                }else if(target ==nums[0] ){
                    return 0;
                }else if(target == nums[nums.length-1]){
                    return nums.length-1;
                }
            }
        //二分法确认target位置
        aim = -1;
        while (left+1 < right){
            aim = (left + right)/2;
            if(nums[aim]<target){
                left =aim;
            }else if(nums[aim]>target){
                right = aim;
            }else {
                break;
            }
        }

        if(left+1 >= right)
            return -1;
        else
            return aim;
    }

    public int search(int[] nums,int target){
        /*
        * 异或规则
        * System.out.println(false^true^false);//true
        * System.out.println(true^true^false);//false
        * System.out.println(false^false^false);//false
        * System.out.println(true^true^true);//true
         */

        int left = 0,right = nums.length-1;
        while (left<right){
            int mid = (left+right)/2;
            if(nums[mid]<nums[0]^target<nums[0]^target>nums[mid]){
                left = mid+1;
            }else {
                right=mid;
            }
         }
        return left == right && nums[left]==target?left:-1;
    }
}
