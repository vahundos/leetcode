package com.github.vahundos.leetcode.solution.easy;

import java.util.Arrays;

// https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int resIndex = 0, xIndex = 0, yIndex = nums.length / 2; resIndex < nums.length; resIndex += 2, xIndex++, yIndex++) {
            result[resIndex] = nums[xIndex];
            result[resIndex + 1] = nums[yIndex];
        }

        return result;
    }

    public static void main(String[] args) {
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();

        System.out.println(Arrays.toString(shuffleTheArray.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3))); // [2,3,5,4,1,7]
        System.out.println(Arrays.toString(shuffleTheArray.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4))); // [1,4,2,3,3,2,4,1]
        System.out.println(Arrays.toString(shuffleTheArray.shuffle(new int[]{1, 1, 2, 2}, 2))); // [1,2,1,2]
    }
}
