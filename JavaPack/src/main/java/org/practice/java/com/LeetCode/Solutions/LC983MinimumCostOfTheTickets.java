package org.practice.java.com.LeetCode.Solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LC983MinimumCostOfTheTickets {

    HashSet<Integer> daySet = new HashSet<>();
    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1] + 30;
        int[] dpMemory = new int[lastDay + 1];
        Arrays.fill(dpMemory, -1);
        for (int i: days) {
            daySet.add(i);
        }
        return calculateCostRecursively(dpMemory, days, costs, days[0]);
    }

    int calculateCostRecursively(int[] dpMemory, int[] days, int[] costs, int currentDay) {
        if(currentDay > days[days.length - 1]) {
            dpMemory[currentDay] = 0;
            return dpMemory[currentDay];
        }
        if (dpMemory[currentDay] != -1) {
            return dpMemory[currentDay];
        }
        if (!daySet.contains(currentDay)) {
            dpMemory[currentDay] = calculateCostRecursively(dpMemory, days, costs, currentDay + 1);
            return dpMemory[currentDay];
        }
        int oneDayCost = costs[0] + calculateCostRecursively(dpMemory, days, costs, currentDay + 1);
        int sevenDayCost = costs[1] + calculateCostRecursively(dpMemory, days, costs, currentDay + 7);
        int thirtyDaysCost = costs[2] + calculateCostRecursively(dpMemory, days, costs, currentDay + 30);
        dpMemory[currentDay] = Math.min(oneDayCost, Math.min(sevenDayCost, thirtyDaysCost));
        return dpMemory[currentDay];
    }
    public static void main(String[] args) {
        LC983MinimumCostOfTheTickets obj = new LC983MinimumCostOfTheTickets();
        int[] days = {1,2,3,4,5,6,7,8,9,10,30,31};
        int[] costs = {2,7,15};
        System.out.println(obj.mincostTickets(days, costs)); // Expected: 11
    }
}
