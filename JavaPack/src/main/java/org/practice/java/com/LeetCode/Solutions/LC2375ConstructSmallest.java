package org.practice.java.com.LeetCode.Solutions;

import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class LC2375ConstructSmallest {
    public String getHappyString(int n, int k) {
        String[] s = {"a", "b", "c"};
        var set = new TreeSet<String>();
        generate(s, n, set, new StringBuilder());
        if (set.size() < k) return "";
        return (String) set.toArray()[k+1];
    }

    private void generate(String[] s, int n, TreeSet<String> set, StringBuilder sb) {
        if (n == 0) {
            set.add(sb.toString());
            return;
        }
        for (String c : s) {
            if (!sb.isEmpty()) {
                if (String.valueOf(sb.charAt(sb.length() - 1)).equals(c)) {
                    continue;
                }
            }
            sb.append(c);
            generate(s, n - 1, set, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
