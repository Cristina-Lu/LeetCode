package com.medium;

import org.junit.Test;

public class Problem36ValidSudokuTest {
    @Test
    public void test(){
        Problem36ValidSudoku problem36ValidSudoku
                =new Problem36ValidSudoku();
        char[][] news = new char[9][9];
        char[] newOne  = {'1','2','3','4','5','6','7','8','9'};
        char[] newTwo  = {'4','5','6','7','8','9','1','2','3'};
        char[] newThree= {'.','.','.','1','2','3','4','5','6'};
        char[] newFour = {'3','4','5','6','8','8','9','1','2'};
        char[] newFive = {'6','7','8','9','1','2','3','4','5'};
        char[] newSix  = {'9','1','2','3','4','5','6','7','8'};
        char[] newSeven= {'2','3','4','5','6','7','8','9','1'};
        char[] newEight= {'5','6','7','8','9','1','2','3','4'};
        char[] newNine = {'8','9','1','2','3','4','5','6','7'};
        news[0] = newOne;
        news[1] = newTwo;
        news[2] = newThree;
        news[3] = newFour;
        news[4] = newFive;
        news[5] = newSix;
        news[6] = newSeven;
        news[7] = newEight;
        news[8] = newNine;

        System.out.println(problem36ValidSudoku.isValidSudoku(news));
        //System.out.print('.'-'0');
    }
}
