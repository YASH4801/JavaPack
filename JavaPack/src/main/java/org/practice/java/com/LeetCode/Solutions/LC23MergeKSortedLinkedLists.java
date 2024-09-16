package org.practice.java.com.LeetCode.Solutions;

import org.practice.java.com.LeetCode.Solutions.Models.ListNode;

public class LC23MergeKSortedLinkedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode head = lists[0];
        for (int i = 1; i < lists.length; i++) {
            head = mergeTwoNodes(head, lists[i]);
        }
        return head;
    }

    private ListNode mergeTwoNodes(ListNode first, ListNode second) {
        ListNode returnedHead;
        if (first == null && second == null) {
            returnedHead = null;
        } else if (first == null) {
            returnedHead = second;
        } else if (second == null) {
            returnedHead = first;
        } else {
            var firstTemp = first.next;
            var secondTemp = second.next;
            if (first.val < second.val) {
                first.next = mergeTwoNodes(firstTemp, second);
                returnedHead = first;
            } else {
                second.next = mergeTwoNodes(first, secondTemp);
                returnedHead = second;
            }
        }
        return returnedHead;
    }
}
