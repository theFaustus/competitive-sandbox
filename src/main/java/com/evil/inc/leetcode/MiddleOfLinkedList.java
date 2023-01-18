package com.evil.inc.leetcode;

import lombok.Data;

import java.util.ArrayList;

public class MiddleOfLinkedList {
    public ListNode solve(ListNode head) {
        ArrayList<ListNode> listNodes = new ArrayList<>();
        while (head != null){
            listNodes.add(head);
            head = head.next;
        }

        return listNodes.get(listNodes.size() / 2);
    }

    public ListNode solveFastPointer(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    @Data
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
