package com.wxw.boc_solution.offer.o03;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if ( map.containsKey(num)) {
                return num;
            }
            map.put(num, 1);
        }

        return 0;
    }
}
