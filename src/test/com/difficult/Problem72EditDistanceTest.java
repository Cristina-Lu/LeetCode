package com.difficult;

import org.junit.Test;

public class Problem72EditDistanceTest {
    @Test
    public void test(){
        Problem72EditDistance problem72EditDistance = new Problem72EditDistance();
        String word1 ="horse";
        String word2 ="ros";
        System.out.println(problem72EditDistance.minDistance(word1,word2));//3

        String word3 ="";
        String word4 ="";
        System.out.println(problem72EditDistance.minDistance(word3,word4));//0


        String word5 ="a";
        String word6 ="b";
        System.out.println(problem72EditDistance.minDistance(word5,word6));//1

        String word7 ="intention";
        String word8 ="execution";
        System.out.println(problem72EditDistance.minDistance(word7,word8));//5

        String word9 ="mart";
        String word10 ="karma";
        System.out.println(problem72EditDistance.minDistance(word9,word10));//3


        String word11 ="zoologicoarchaeologist";
        String word12 ="zoogeologist";
        System.out.println(problem72EditDistance.minDistance(word11,word12));

    }
}
