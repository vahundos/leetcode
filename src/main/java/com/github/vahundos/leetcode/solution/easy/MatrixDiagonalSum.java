package com.github.vahundos.leetcode.solution.easy;

// https://leetcode.com/problems/matrix-diagonal-sum/
public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            result += mat[i][i];

            int secondaryRowIndex = mat.length - 1 - i;
            if (i != secondaryRowIndex) {
                result += mat[secondaryRowIndex][i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        var matrixDiagonalSum = new MatrixDiagonalSum();

        System.out.println(matrixDiagonalSum.diagonalSum(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}})); // 25
    }
}
