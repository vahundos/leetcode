package com.github.vahundos.leetcode.solution.easy;

// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;

            n /= 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        var solution = new SubtractTheProductAndSumOfDigitsOfAnInteger();

        System.out.println(solution.subtractProductAndSum(234)); // 15
        System.out.println(solution.subtractProductAndSum(4421)); // 21
    }
}
