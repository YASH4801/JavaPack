package org.practice.java.com.LeetCode.Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Character.isDigit;

public class LC1910RAOS {
    public String removeOccurrences(String s, String part) {
        var sb = new StringBuilder();
        sb.append(s);
        int i = 0;
        var charList = Arrays.asList(s.split(""));
        while (sb.toString().contains(part)) {
            if (charList.get(i).equals(String.valueOf(part.charAt(0))));
            {
                var subList = charList.subList(i, i + part.length());
                if (String.join("", subList).equals(part)) {
                    subList.forEach(charList::remove);
                }
                i = i + part.length() + 1;
            }
        }
        return sb.toString();
    }

    private int[] searchSubstring(StringBuilder sb, String part) {
        boolean found = false;
        int start = 0;
        int[] res = new int[0];
        while (!found || start < sb.length()) {
            if (sb.charAt(start) == part.charAt(0)) {
                int[] idx = new int[part.length()];
                idx[0] = sb.charAt(start);
                for (int i = 1; i < part.length(); i++) {
                    if (sb.charAt(idx[start]) == part.charAt(i)) {
                        idx[i] = start;
                        if (i == part.length() - 1) {
                            found = true;
                            res = idx;
                            break;
                        }
                    } else {
                        start++;
                        break;
                    }
                }
                start++;
            }
        }
        return res;
    }
}
