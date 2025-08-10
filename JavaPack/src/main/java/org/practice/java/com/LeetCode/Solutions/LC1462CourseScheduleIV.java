package org.practice.java.com.LeetCode.Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1462CourseScheduleIV {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Boolean> result = new ArrayList<>();
        if (prerequisites.length == 0) {
            for (int i = 0; i < queries.length; i++) {
                result.add(true);
            }
            return result;
        }
        var prArray = new ArrayList<List<Integer>>();
        for (int[] prerequisite : prerequisites) {
            prArray.add(List.of(prerequisite[0], prerequisite[1]));
        }
        for (int[] i : queries){
            if(prArray.contains(List.of(i[0], i[1]))) {
                result.add(true);
            } else {
                result.add(dfs(prerequisites, i[0], i[1]));
            }
        }
        return result;
    }

    private boolean dfs(int[][] prerequisites, int a, int b) {
        for (int i = 0; i < prerequisites.length; i++) {
            if (prerequisites[i][0] == a && prerequisites[i][1] == b) {
                return true;
            } if (prerequisites[i][0] == a) {
                return dfs(prerequisites, prerequisites[i][1], b);
            } if (prerequisites[i][1] == b) {
                return false;
            }
        }
        return false;
    }
}
