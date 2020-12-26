package java.simple;

import java.util.*;

public class ProblemOneTwoSum {
    /*
    * 思路
    * 利用Map形成 数值-位置键值对
    * 排序数值
    * 计算挑出符合条件的数值
    * 输出对应的位置
    *
    * 用到的知识点
    * 1、Map根据value排序
    * 2、获取Map中的单个键值对
    *
    */
    public int[] twoSum(int[] nums, int target) {
        //use TreeMap to sort the sums，and also，don‘t forget the indices
        Map<Integer,Integer> mySum = new HashMap<>();
        for(int i = 0; i<nums.length;++i){
            /*if(nums[i]>target){
                continue;
            }*/
            mySum.put(i,nums[i]);
        }

        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(mySum.entrySet());

        Collections.sort(entryList, Comparator.comparingInt(Map.Entry::getValue));

        int[] result = new int[2];
        for(int i = 0;i<entryList.size();++i){
            Integer minValue = entryList.get(i).getValue();
            Integer maxValue;
            Integer maxKey = null;
            for(int j = entryList.size()-1;j>i;--j){
                maxValue = entryList.get(j).getValue();
                if(maxValue+minValue ==target)
                    maxKey = entryList.get(j).getKey();
            }

            if(maxKey!=null){
                result[0]=entryList.get(i).getKey();
                result[1]=maxKey;
                break;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    /*
    * 思路：
    * 将与数组中的数互补的数（指两数相加等于target的数）及对应的位置存入Map
    * 验证后续数组中的数是否出现在互补数的Map中
    * 若不存在，将该数的互补数存入Map
    * 若存在，输出最终结果
    *
    * TODO 思路中较为巧妙的是互补数的思路
    *
    */
    public int[] twoSumOthers(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++) {
            int n = target - nums[i];
            if(!map.isEmpty() && map.containsKey(n)) {
                return new int[] {map.get(n), i};
            } else {
                map.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("no such solution");
    }
}
