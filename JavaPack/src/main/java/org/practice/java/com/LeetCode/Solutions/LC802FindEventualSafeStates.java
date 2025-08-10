package org.practice.java.com.LeetCode.Solutions;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class LC802FindEventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> safeNodes = new ArrayList<Integer>();
        for(int i = 0; i < graph.length; i++) {
            if(graph[i].length == 0){
                safeNodes.add(i);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if (isSafeNode(graph[i], safeNodes)){
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSafeNode(int[] ints, List<Integer> safeCheck) {
        for(int i : ints) {
            if (!safeCheck.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
