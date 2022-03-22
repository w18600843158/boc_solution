package com.wxw.boc_solution.offer.o06;

import com.wxw.boc_solution.common.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class Solution {
    private List<Integer> res = new ArrayList<>();

    public int[] reversePrint(ListNode head) {
        traverse(head);
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }

    private ListNode traverse (ListNode node) {
        if (node == null) {
            return null;
        }
        ListNode next = traverse(node.getNext());
        res.add(node.getVal());
        return node;
    }
}
