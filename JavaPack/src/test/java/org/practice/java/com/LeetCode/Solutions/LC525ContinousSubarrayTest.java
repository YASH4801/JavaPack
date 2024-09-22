package org.practice.java.com.LeetCode.Solutions;

import org.junit.jupiter.api.Test;
import org.practice.java.com.ConfigReader.TestCaseReader;
import org.practice.java.com.ConfigReader.TestCaseUtils;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LC525ContinousSubarrayTest {

    LC525ContinousSubarray tested = new LC525ContinousSubarray();

    @Test
    void findMaxLength() {
        List<List<String>> testCases;
        try {
            testCases = TestCaseReader.loadTestCase(1, 525);
            System.out.println(testCases);
        } catch (IOException ex) {
            System.out.println("Error reading test cases: " + ex.getMessage());
            return;  // Return early to avoid unnecessary further testing.
        }

        var refinedTestCases = TestCaseUtils.cleanTestCases(testCases);

        assertValues(2, refinedTestCases.get(0).get(0));
        assertValues(2, refinedTestCases.get(1).get(0));
    }

    private void assertValues(int testValue, int[] testCase) {
        int result;
        result = tested.findMaxLength(testCase);
        assertEquals(testValue, result);
    }
}