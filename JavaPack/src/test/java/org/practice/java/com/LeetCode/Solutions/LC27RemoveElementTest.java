package org.practice.java.com.LeetCode.Solutions;

import org.junit.jupiter.api.Test;
import org.practice.java.com.ConfigReader.TestCaseReader;
import org.practice.java.com.ConfigReader.TestCaseUtils;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
class LC27RemoveElementTest {

    LC27RemoveElement tested = new LC27RemoveElement();

    @Test
    void removeElement() throws IOException {
        var tc = TestCaseReader.loadTestCase(1, 27);
        var refinedTC = TestCaseUtils.cleanTestCases(tc);

        var result = tested.removeElement(refinedTC.get(0).get(0), 3);
        var result2 = tested.removeElement(refinedTC.get(1).get(0), 2);
        assertEquals(2, result);
        assertEquals(5, result2);
    }
}