package org.practice.java.com.LeetCode.Solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LC525ContinousSubarrayTest {

    LC525ContinousSubarray tested = new LC525ContinousSubarray();

    @Test
    void findMaxLength() {
        var testcase_first = new int[]{0, 0, 1, 1, 0};
        var testcase_second = new int[]{1, 1, 0, 0, 0, 1, 1, 1, 1};
        var tc_three = new int[]{0, 1};

        var result = tested.findMaxLength(testcase_first);
        assertEquals(4, result);

        result = tested.findMaxLength(testcase_second);
        assertEquals(6, result);

        result = tested.findMaxLength(tc_three);
        assertEquals(2, result);
    }
}