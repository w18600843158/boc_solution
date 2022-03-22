package com.wxw.boc_solution.common;

import lombok.Data;

@Data
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
