package com.others;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MSProblemMoviesTest {
    @Test
    public void test(){
        MSProblemMovies msProblemMovies = new MSProblemMovies();
        Integer[] list = new Integer[]{30,40,20};
        System.out.println(msProblemMovies.MoviesOrder(5,list));
        Integer[] list1 = new Integer[]{72,55,100,67,33,80,16,24};
        System.out.println(msProblemMovies.MoviesOrder(10,list1));

    }
}
