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
}
