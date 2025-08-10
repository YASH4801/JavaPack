package org.practice.java.com.LeetCode.Solutions;

import java.util.ArrayList;
import java.util.List;

public class LC916WordSubset {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        for (String word : words1) {
            if (containsAllChars(words2, word)) {
                res.add(word);
            }
        }
        return res;
    }


    private boolean containsAllChars(String[] s1, String s2) {
        StringBuilder sb = new StringBuilder(s2);
        for (int i = 0; i < s1.length; i++) {
            if (s1[0].length() == 1) {
                if (!sb.toString().contains(s1[i])) {
                    return false;
                }
            } else {
                if (!containsAllChars(s1[i].split(""), s2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LC916WordSubset solution = new LC916WordSubset();
        String[] words1 = {"acaaa","cbabb","ababc","aabbb","cbbbc"};
        String[] words2 = {"ba","bb","cc"};
        System.out.println(solution.wordSubsets(words1, words2)); // Output: ["facebook","google","leetcode"]
    }
}
