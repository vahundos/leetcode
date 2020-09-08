package com.github.vahundos.leetcode.solution.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies)
                               .max()
                               .orElseThrow();

        return Arrays.stream(candies)
                     .mapToObj(value -> value + extraCandies >= maxCandies)
                     .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        KidsWithTheGreatestNumberOfCandies solution = new KidsWithTheGreatestNumberOfCandies();

        System.out.println(solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3)); // [true,true,true,false,true]
        System.out.println(solution.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1)); // [true,false,false,false,false]
        System.out.println(solution.kidsWithCandies(new int[]{12, 1, 12}, 10)); // [true,false,true]
    }
}
