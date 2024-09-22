package org.practice.java.com.ConfigReader;

import java.util.ArrayList;
import java.util.List;

public class TestCaseUtils {
    public static List<Integer> convertStringListToIntegerList(List<String> data) {
        return data.stream().map(Integer::parseInt).toList();
    }

    public static int[] convertStringListToIntegerArray(List<String> data) {
        return data.stream().map(Integer::parseInt).mapToInt(Integer::intValue).toArray();
    }

    public static List<String> getCleanList(String values) {
        List<String> list = new ArrayList<String>();
        for (char s : values.toCharArray()) {
            if (Character.isDigit(s))
                list.add(String.valueOf(s));
        }
        return list;
    }

    public static List<List<int[]>> cleanTestCases(List<List<String>> data) {
        return data.stream().map(testCase -> testCase.stream()
                .map(list -> getCleanList(list))
                .map(TestCaseUtils::convertStringListToIntegerArray)
                .toList()).toList();
    }
}
