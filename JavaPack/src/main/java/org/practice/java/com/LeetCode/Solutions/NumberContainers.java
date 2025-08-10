package org.practice.java.com.LeetCode.Solutions;

import java.util.*;

public class NumberContainers {

    private TreeMap<Integer, Integer> map;
    private TreeMap<Integer, TreeSet<Integer>> container;

    public NumberContainers() {
        this.map = new TreeMap<>();
        this.container = new TreeMap<>();
    }

    public void change(int index, int number) {
        if (map.containsKey(index)) {
            var oldNumber = map.get(index);
            var set = container.get(oldNumber);
            set.remove(index);
            var newNumber = new TreeSet<Integer>();
            newNumber.add(number);
            container.put(number, newNumber);
        }
        map.put(index, number);
    }

    public int find(int number) {
        var idx = container.get(number);
        if (idx != null && !idx.isEmpty()) {
            return idx.first();
        }
        return -1;
    }
}
