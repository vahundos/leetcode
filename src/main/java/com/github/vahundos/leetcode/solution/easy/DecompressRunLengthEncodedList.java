package com.github.vahundos.leetcode.solution.easy;

import java.util.Arrays;

// https://leetcode.com/problems/decompress-run-length-encoded-list/
public class DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {
        int freq = nums[0];
        int val = nums[1];

        int[] result = new int[freq];
        Arrays.fill(result, val);

        for (int i = 2; i < nums.length; i += 2) {
            freq = nums[i];
            val = nums[i + 1];

            int[] tmpRes = new int[result.length + freq];
            System.arraycopy(result, 0, tmpRes, 0, result.length);
            Arrays.fill(tmpRes, result.length, tmpRes.length, val);

            result = tmpRes;
        }

        return result;
    }

    public static void main(String[] args) {
        var solution = new DecompressRunLengthEncodedList();

        System.out.println(Arrays.toString(solution.decompressRLElist(new int[]{1, 2, 3, 4}))); // [2,4,4,4]
        System.out.println(Arrays.toString(solution.decompressRLElist(new int[]{1, 1, 2, 3}))); // [1,3,3]
    }
}
