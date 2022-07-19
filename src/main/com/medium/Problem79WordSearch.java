package com.medium;

public class Problem79WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)){
                    if (search(board ,word,1,i,j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board ,String word , int wordS ,int i ,int j){
        if(word.length() == wordS){
            return true;
        }
        char tempBoard = board[i][j];
        board[i][j] = '1';
        boolean i1=false,i2=false,j1=false,j2=false;
        if(i-1>=0 && board[i-1][j] != '1' && board[i-1][j] == word.charAt(wordS)){
            char temp = board[i-1][j];
            board[i-1][j] = '1';
            i1= search(board ,word ,wordS+1,i-1,j);
            if(i1){
                return i1;
            }
            board[i-1][j] = temp;
        }
        if(i+1<board.length && board[i+1][j] != '1' && board[i+1][j] == word.charAt(wordS)){
            char temp = board[i+1][j];
            board[i+1][j] = '1';
            i2= search(board ,word ,wordS+1,i+1,j);
            if(i2){
                return i2;
            }
            board[i+1][j] =temp;
        }
        if(j-1>=0 && board[i][j-1] != '1' && board[i][j-1] == word.charAt(wordS)){
            char temp = board[i][j-1];
            board[i][j-1] = '1';
            j1= search(board ,word ,wordS+1,i,j-1);
            if(j1){
                return j1;
            }
            board[i][j-1] = temp;
        }
        if(j+1<board[0].length && board[i][j+1] != '1' && board[i][j+1] == word.charAt(wordS)){
            char temp = board[i][j+1];
            board[i][j+1] = '1';
            j2 = search(board,word ,wordS+1,i,j+1);
            if(j2){
                return j2;
            }
            board[i][j+1] =temp;
        }
        board[i][j] = tempBoard;
        return false;
    }
}










