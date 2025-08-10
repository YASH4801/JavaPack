package org.practice.java.com.LeetCode.Solutions;

import java.util.HashMap;

public class LC2559VowelCountInRange {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int [] result = new int[queries.length];
        int[] count = new int[words.length];
        int validWordCount = 0;
        for (int i = 0; i < words.length; i++) {
            if (isValidString(words[i])) {
                validWordCount ++;
            }
            count[i] = validWordCount;
        }
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            result[i] = count[end] - (start == 0? 0 : count[start - 1]);
        }
        return result;
    }

    private boolean isValidString(String str) {
        return "aeiouAEIOU".indexOf(str.charAt(0)) != -1
                && "aeiouAEIOU".indexOf(str.charAt(str.length() - 1)) != -1;
    }
}
