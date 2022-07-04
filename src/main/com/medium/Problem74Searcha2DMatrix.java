package com.medium;

public class Problem74Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int IrangeTo = matrix.length;
        int IrangeFrom = 0;
        int JrangeTo = matrix[0].length;
        int JrangeFrom = 0;
        while (true){
            int nowMiddleI = (IrangeFrom+IrangeTo)/2;
            if (nowMiddleI == IrangeFrom || nowMiddleI == IrangeTo){
                int nowMiddleJ = (JrangeFrom+JrangeTo)/2;
                if(nowMiddleJ == JrangeFrom || nowMiddleJ == JrangeTo){
                    if (target != matrix[nowMiddleI][nowMiddleJ]){
                        return false;
                    }else {
                        return true;
                    }
                }else if(target >matrix[nowMiddleI][nowMiddleJ]){
                    JrangeFrom = nowMiddleJ;
                }else if(target <matrix[nowMiddleI][nowMiddleJ]){
                    JrangeTo = nowMiddleJ;
                }else {
                    return true;
                }
            }else if(target >matrix[nowMiddleI][0]){
                IrangeFrom = nowMiddleI;
            }else if(target <matrix[nowMiddleI][0]){
                IrangeTo = nowMiddleI;
            }else {
                return true;
            }
        }
    }
}
