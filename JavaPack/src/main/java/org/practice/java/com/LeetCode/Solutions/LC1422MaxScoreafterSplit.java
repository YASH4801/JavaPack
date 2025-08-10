package org.practice.java.com.LeetCode.Solutions;

public class LC1422MaxScoreafterSplit {
    public int maxScore(String s) {
        int maxScore = 0;
        for (int i = 1; i < s.length(); i++) {
            int score = countScore(s.substring(0, i), 0) + countScore(s.substring(i), 1);
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }

    private int countScore(String s, int identifier) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Integer.parseInt(String.valueOf(c)) == identifier) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LC1422MaxScoreafterSplit solution = new LC1422MaxScoreafterSplit();
        System.out.println(solution.maxScore("011101")); // Output: 5
        System.out.println(solution.maxScore("00111")); // Output: 3
        System.out.println(solution.maxScore("1111")); // Output: 3
    }
}
