package com.github.vahundos.leetcode.solution.easy;

// https://leetcode.com/problems/shuffle-string/
public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }

    public static void main(String[] args) {
        var shuffleString = new ShuffleString();

        System.out.println(shuffleString.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
        System.out.println(shuffleString.restoreString("abc", new int[]{0, 1, 2}));
        System.out.println(shuffleString.restoreString("aiohn", new int[]{3, 1, 4, 2, 0}));
        System.out.println(shuffleString.restoreString("art", new int[]{1, 0, 2}));
    }
}
