package com.github.vahundos.leetcode.solution.easy;

import java.util.Arrays;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            int smallerNumsCount = 0;
            for (int innerNum : nums) {
                if (innerNum < num) {
                    smallerNumsCount++;
                }
            }

            result[i] = smallerNumsCount;
        }

        return result;
    }

    public static void main(String[] args) {
        var howManyNumbersAreSmallerThanTheCurrentNumber = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        System.out.println(Arrays.toString(howManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}))); // [4,0,1,1,3]
        System.out.println(Arrays.toString(howManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8}))); // [2,1,0,3]
        System.out.println(Arrays.toString(howManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(new int[]{7, 7, 7, 7}))); // [0,0,0,0]
    }
}
