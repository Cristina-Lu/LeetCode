package com.others;

import com.toolClasses.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MSProblemMovies {

    /*
    * 电影院几个影厅从同一时间开始循环播放几部时长不同的电影，需要返回最省时间的观看方式
    *
    * 输入电影间隔，每部电影的时长，返回看完所有电影耗时最短的耗时
    *
    * */

    /*贪心算法，无法覆盖所有情况*/
    public Integer MoviesOrder1(int interval, Integer[] moviesList) {
        Arrays.sort(moviesList);
        Integer minTime = (moviesList[moviesList.length - 1] + interval) * moviesList.length;

        List<Integer> myList = new ArrayList<>();
        for (int j = moviesList.length - 1; j >= 0; --j) {
            Integer allTime = 0;
            int[] flags = new int[moviesList.length];
            flags[j] = 1;
            allTime = moviesList[j];
            List<Integer> temp = new ArrayList<>();
            temp.add(moviesList[j]);
            while (true) {
                int min = -1;
                int minlocal = moviesList.length;
                boolean flag = false;
                for (int i = moviesList.length - 1; i >= 0; --i) {
                    if (flags[i] == 0) {
                        int t = 0;
                        int up = allTime / (moviesList[i] + interval);
                        if (allTime % (moviesList[i] + interval) != 0) {
                            up++;
                        }
                        t = up * (moviesList[i] + interval) - allTime;
                        if (min != -1 && t < min) {
                            min = t;
                            minlocal = i;
                        } else if (min == -1) {
                            min = t;
                            minlocal = i;
                        }
                        flag = true;
                    }
                }
                if (flag) {
                    flags[minlocal] = 1;
                    allTime = allTime + min + moviesList[minlocal];
                    temp.add(moviesList[minlocal]);
                } else {
                    break;
                }
            }
            if (minTime > allTime) {
                minTime = allTime;
                myList = temp;
            }
        }
        System.out.println(myList);
        return minTime;
    }

    /*dfs
    * 可以覆盖所有情况，可以考虑在面试中使用最稳妥的办法
    * */
    public Integer MoviesOrder(int interval, Integer[] moviesList){
        Integer time = 0;
        Arrays.sort(moviesList);
        return dfs(interval,moviesList,new int[moviesList.length],(moviesList[moviesList.length-1]+interval)*moviesList.length,0);

    }
    private Integer dfs(int interval, Integer[] moviesList,int[] flags,int maxTime,int nowTime){
        int local = 0;
        while (local<flags.length && flags[local]!=0){
            local++;
        }
        if(local ==flags.length){
            if(maxTime >nowTime)
                return nowTime;
        }else {
            for (int i =local;i<flags.length;++i){
                if(flags[i]==0){
                    int up = (int) (Math.ceil((double) nowTime / (moviesList[i] + interval)) * (moviesList[i] + interval));
                    if(maxTime<up+moviesList[i]){
                        return maxTime;
                    }
                    flags[i] = 1;
                    maxTime = dfs(interval, moviesList, flags, maxTime, up + moviesList[i]);
                    flags[i] = 0;
                }
            }

        }
        return maxTime;
    }
}
