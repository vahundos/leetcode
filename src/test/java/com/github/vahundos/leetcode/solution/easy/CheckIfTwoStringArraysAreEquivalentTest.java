package com.github.vahundos.leetcode.solution.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckIfTwoStringArraysAreEquivalentTest {

    private CheckIfTwoStringArraysAreEquivalent testObj;

    @BeforeEach
    public void setUp() {
        this.testObj = new CheckIfTwoStringArraysAreEquivalent();
    }

    @Test
    void arrayStringsAreEqual() {
        assertThat(testObj.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"})).isTrue();
        assertThat(testObj.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"})).isFalse();
        assertThat(testObj.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"})).isTrue();
    }
}