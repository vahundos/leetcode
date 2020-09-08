package com.github.vahundos.leetcode.solution.easy;

// https://leetcode.com/problems/number-of-good-pairs/
public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();

        System.out.println(numberOfGoodPairs.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3})); // 4
        System.out.println(numberOfGoodPairs.numIdenticalPairs(new int[]{1, 1, 1, 1})); // 6
        System.out.println(numberOfGoodPairs.numIdenticalPairs(new int[]{1, 2, 3})); // 0
    }
}
