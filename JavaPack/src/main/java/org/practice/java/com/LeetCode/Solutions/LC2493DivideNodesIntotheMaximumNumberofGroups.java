package org.practice.java.com.LeetCode.Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LC2493DivideNodesIntotheMaximumNumberofGroups {
    public int magnificentSets(int n, int[][] edges) {
        var map = new HashMap<Integer, List<Integer>>();
        for (var edge : edges) {
            map.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            map.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }
        var xset = new HashSet<Integer>();
        var yset = new HashSet<Integer>();
        var visited = new HashSet<Integer>();
        dfs(map, visited, 1, xset, yset);
        for (var edge: edges) {
            if (xset.contains(edge[0]) && xset.contains(edge[1])) {
                return -1;
            }
        }
        return Math.max(xset.size(), yset.size());
    }

    private void dfs(HashMap<Integer, List<Integer>> map, HashSet<Integer> visited, int i, HashSet<Integer> xset, HashSet<Integer> yset) {
        if (visited.contains(i)) {
            return;
        }
        xset.add(i);
        yset.addAll(map.get(i));
        visited.add(i);
        for (var y : yset) {
            dfs(map, visited, y, yset, xset);
        }
    }
}
