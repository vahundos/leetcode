package com.github.vahundos.leetcode.solution.easy;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class CheckIfTwoStringArraysAreEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder firstWordBuilder = new StringBuilder();
        for (String s : word1) {
            firstWordBuilder.append(s);
        }

        StringBuilder secondWordBuilder = new StringBuilder();
        for (String s : word2) {
            secondWordBuilder.append(s);
        }

        return firstWordBuilder.toString().equals(secondWordBuilder.toString());
    }

    public static void main(String[] args) {
        var solution = new CheckIfTwoStringArraysAreEquivalent();

        System.out.println(solution.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"})); // true
        System.out.println(solution.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"})); // false
        System.out.println(solution.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"})); // true
    }
}
