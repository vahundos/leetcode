package com.github.vahundos.leetcode.solution.easy;

import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] + nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();
        int[] result = runningSumOf1dArray.runningSum(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(result));
    }
}
