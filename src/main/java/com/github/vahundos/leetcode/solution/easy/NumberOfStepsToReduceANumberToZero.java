package com.github.vahundos.leetcode.solution.easy;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumberOfStepsToReduceANumberToZero {

    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }

            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        var solution = new NumberOfStepsToReduceANumberToZero();
        System.out.println(solution.numberOfSteps(14)); // 6
        System.out.println(solution.numberOfSteps(8)); // 4
        System.out.println(solution.numberOfSteps(123)); // 12
    }
}
