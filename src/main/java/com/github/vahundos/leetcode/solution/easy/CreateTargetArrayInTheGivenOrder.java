package com.github.vahundos.leetcode.solution.easy;

import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder {

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);

        for (int i = 0; i < nums.length; i++) {
            int indexToInsert = index[i];
            if (result[indexToInsert] == -1) {
                result[indexToInsert] = nums[i];
            } else {
                int[] tmpRes = new int[result.length];
                System.arraycopy(result, 0, tmpRes, 0, indexToInsert);
                tmpRes[indexToInsert] = nums[i];
                System.arraycopy(result, indexToInsert, tmpRes, indexToInsert + 1, result.length - 1 - indexToInsert);

                result = tmpRes;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        var solution = new CreateTargetArrayInTheGivenOrder();

        System.out.println(Arrays.toString(solution.createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}))); // [0,4,1,3,2]
        System.out.println(Arrays.toString(solution.createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0}))); // [0,1,2,3,4]
        System.out.println(Arrays.toString(solution.createTargetArray(new int[]{1}, new int[]{0}))); // [0,1,2,3,4]
    }
}
