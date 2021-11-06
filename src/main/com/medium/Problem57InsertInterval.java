package com.medium;

public class Problem57InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0){
            return new int[][]{newInterval};
        }
        int num=0;
        boolean flag=false;//新区间是否已插入
        boolean flagTwo =false;//新区间是否无法与原有区间合并
        int place = intervals.length;
        for (int i=0;i<intervals.length;++i){
            if(!flag){//插入新区间
                if(intervals[i][0]<=newInterval[0]
                        && intervals[i][1]>=newInterval[0]){//如果新区间左端点在当前区间范围内
                    if(newInterval[1]>=intervals[i][1]){//右端点大于当前区间右端点
                        intervals[i][1]=newInterval[1];
                        flag=true;
                        num=i;
                    }else {
                        return intervals;
                    }
                }else if(intervals[i][1]<newInterval[0]){
                    if(i!=intervals.length-1
                            && intervals[i+1][0]>newInterval[1]){//如果新区间在两个原始区间中间
                        flagTwo=true;
                        place = i+1;
                        break;
                    }else if(i==intervals.length-1){//如果新区间在所有原始区间最后面
                        flagTwo=true;
                        place = i+1;
                        break;
                    }
                }else if(intervals[i][0]>newInterval[0]){//如果新区间左端点在当前区间前
                    if(intervals[i][0]>newInterval[1]){//如果新区间右端点也在当前区间前面
                        place=i;
                        flagTwo=true;
                        break;
                    }else {
                        intervals[i][0]=newInterval[0];
                        intervals[i][1]=Math.max(intervals[i][1],newInterval[1]);
                        flag=true;
                        num=i;
                    }
                }
            }else {//合并剩余区间
                if(intervals[i][0]<=intervals[num][1]){
                    if(intervals[num][1]<intervals[i][1]){
                        intervals[num][1]=intervals[i][1];
                    }
                }else {
                    num++;
                    intervals[num]=intervals[i];
                }
            }
        }
        int[][] res ;
        if(flagTwo ){
            res = new int[intervals.length+1][];
            boolean ifPlace =false;
            for (int i=0; i<res.length;++i){
                if(i==place){
                    res[i]=newInterval;
                    ifPlace=true;
                }else {
                    if(ifPlace){
                        res[i]= intervals[i-1];
                    }else {
                        res[i]=intervals[i];
                    }
                }
            }
        }else {
            res =  new int[num+1][];
            for (int i=0;i<=num;++i){
                res[i]=intervals[i];
            }
        }
        return res;
    }
}
