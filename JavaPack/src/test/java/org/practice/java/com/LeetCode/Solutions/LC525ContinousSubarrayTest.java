package org.practice.java.com.LeetCode.Solutions;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.practice.java.com.ConfigReader.TestCaseReader;

class LC525ContinousSubarrayTest {

    LC525ContinousSubarray tested = new LC525ContinousSubarray();

    @Test
    void findMaxLength() {
        var testcase_first = new int[]{0, 0, 1, 1, 0};
        var testcase_second = new int[]{1, 1, 0, 0, 0, 1, 1, 1, 1};
        var tc_three = new int[]{0, 1};

        try {
            var testCases = TestCaseReader.loadTestCase(1, 525);
            System.out.println(testCases);         
        } catch (IOException ex) {
            System.out.println("Error reading test cases: " + ex.getMessage());
            return;  // Return early to avoid unnecessary further testing.
        }

        var result = tested.findMaxLength(testcase_first);
        assertEquals(4, result);

        result = tested.findMaxLength(testcase_second);
        assertEquals(6, result);

        result = tested.findMaxLength(tc_three);
        assertEquals(2, result);
    }
}