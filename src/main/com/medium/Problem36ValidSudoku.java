package com.medium;

public class Problem36ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][];//行
        int[][] lows = new int[9][];//列
        int[][] size = new int[9][];//块
        for (int i = 0; i <9 ; i++) {
            rows[i] = new int[9];
            lows[i] = new int[9];
            size[i] = new int[9];
        }
        boolean result = true;
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                int thisChar = board[i][j]-'0';
                if(thisChar <0 ||thisChar >9)
                    continue;
                if(rows[i][thisChar-1]==0){
                    rows[i][thisChar-1] = 1;
                }else {
                    result = false;
                    break;
                }
                if(lows[j][thisChar-1] == 0){
                    lows[j][thisChar-1] =1;
                }else {
                    result = false;
                    break;
                }
                //确定当前块
                int location = i/3*3+j/3;
                if(size[location][thisChar-1] == 0){
                    size[location][thisChar-1] = 1;
                }else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
