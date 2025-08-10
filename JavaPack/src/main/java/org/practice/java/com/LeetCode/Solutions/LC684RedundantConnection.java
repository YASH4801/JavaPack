package org.practice.java.com.LeetCode.Solutions;

public class LC684RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        for (int[] edge : edges) {
            int x = find(parent, edge[0]);
            int y = find(parent, edge[1]);

            if (x == y) {
                return edge;
            }
            parent[x] = y;
        }

        return new int[0];
    }

    private int find(int[] parent, int x) {
        while (parent[x]!= x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
}
