package com.wxw.boc_solution.offer.o05;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
public class Solution {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                sb.append("02%");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.reverse().toString();
    }
}
