package com.wxw.boc_solution.offer.o04;

import com.wxw.boc_solution.offer.o04.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{
                {-1,3},
        };
        int target = 3;
        boolean res = solution.findNumberIn2DArray(matrix, target);
        assertEquals(true, res);
    }
}