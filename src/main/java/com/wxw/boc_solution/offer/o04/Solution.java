package com.wxw.boc_solution.offer.o04;

/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        // 异常值判断
        if (matrix.length == 0) {
            return false;
        }
        int n = matrix.length;
        if (matrix[0].length == 0) {
            return false;
        }
        int m = matrix[0].length;
        int i = 0 , j = m - 1;
        while ( i < n && j >= 0) {
            if (matrix[i][j] > target) {
                j--;
            }else if (matrix[i][j] < target){
                i++;
            }else {
                return true;
            }
        }

        return false;
    }
}
