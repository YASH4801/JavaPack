package org.practice.java.com.LeetCode.Solutions;

import java.util.*;

public class LC1930UniquePlindromeOf3char {
    public int countPalindromicSubsequence(String s) {
        HashSet<String> resultset = new HashSet<>();
        HashMap<Character, List<Integer>> wordCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            List<Integer> counts = wordCount.getOrDefault(s.charAt(i), new ArrayList<>());
            if (counts.size() < 2){
                counts.add(i);
            }
            else {
                counts.set(1, i);
            }
            wordCount.put(s.charAt(i), counts);
        }
        wordCount.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .forEach(entry -> {
            String[] words = createPalindrome(s, entry.getValue().get(0), entry.getValue().get(1), entry.getKey());
            resultset.addAll(Arrays.asList(words));
        });
        return resultset.size();
    }

    private String[] createPalindrome(String s, int b, int e, Character c) {
        String[] counts = new String[(e - b) + 1];
        for (int i = b; i < e; i++) {
            counts[i] = String.valueOf(c + s.charAt(i) + c);
        }
        return counts;
    }

//    public int countPalindromicSubsequence(String s) {
//        HashSet<String> resultset = new HashSet<>();
//        HashMap<Character, List<Integer>> wordCount = new HashMap<>();
//
//        // Collect indices of each character
//        for (int i = 0; i < s.length(); i++) {
//            wordCount.computeIfAbsent(s.charAt(i), k -> new ArrayList<>()).add(i);
//        }
//
//        // Generate palindromic subsequences
//        for (Map.Entry<Character, List<Integer>> entry : wordCount.entrySet()) {
//            List<Integer> indices = entry.getValue();
//            if (indices.size() >= 2) {
//                int first = indices.get(0);
//                int last = indices.get(indices.size() - 1);
//                for (int i = first + 1; i < last; i++) {
//                    resultset.add("" + entry.getKey() + s.charAt(i) + entry.getKey());
//                }
//            }
//        }
//
//        return resultset.size();
//    }

    private List<String> test(List<String> words) {
        String result = String.join(",", words);
        return words.stream().filter(str -> countSubstring(result, str) > 1).toList();
    }

    public static int countSubstring(String str, String substr) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }

        return count;
    }

}
