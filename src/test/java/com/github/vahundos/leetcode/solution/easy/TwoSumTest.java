package com.github.vahundos.leetcode.solution.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum testObj;

    @BeforeEach
    public void setUp() {
        this.testObj = new TwoSum();
    }

    @Test
    void twoSum() {
        assertThat(testObj.twoSum(new int[]{2, 7, 11, 15}, 9)).containsExactlyInAnyOrder(0, 1);
        assertThat(testObj.twoSum(new int[]{3, 2, 4}, 6)).containsExactlyInAnyOrder(1, 2);
        assertThat(testObj.twoSum(new int[]{3, 3}, 6)).containsExactlyInAnyOrder(0, 1);
    }
}