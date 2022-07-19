package com.medium;

import org.junit.Test;

public class Problem79WordSearchTest {
    @Test
    public void test(){
        Problem79WordSearch problem79WordSearch = new Problem79WordSearch();
        char[][]board ={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(problem79WordSearch.exist(board ,"ABCCED"));
        char[][]board1 ={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(problem79WordSearch.exist(board1 ,"SEE"));
        char[][]board2 ={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(problem79WordSearch.exist(board2 ,"ABCB"));
    }
}
