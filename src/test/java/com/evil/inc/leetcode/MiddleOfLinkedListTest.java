package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleOfLinkedListTest {

    @Test
    public void solve() {
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        MiddleOfLinkedList.ListNode head = new MiddleOfLinkedList.ListNode(1, new MiddleOfLinkedList.ListNode(2, new MiddleOfLinkedList.ListNode(3, new MiddleOfLinkedList.ListNode(4, new MiddleOfLinkedList.ListNode(5, null)))));
        MiddleOfLinkedList.ListNode head2 = new MiddleOfLinkedList.ListNode(1, new MiddleOfLinkedList.ListNode(2, new MiddleOfLinkedList.ListNode(3, new MiddleOfLinkedList.ListNode(4, new MiddleOfLinkedList.ListNode(5, new MiddleOfLinkedList.ListNode(6, null))))));
        Assertions.assertThat(middleOfLinkedList.solve(head)).isEqualTo(new MiddleOfLinkedList.ListNode(3, new MiddleOfLinkedList.ListNode(4, new MiddleOfLinkedList.ListNode(5, null))));
        Assertions.assertThat(middleOfLinkedList.solve(head2)).isEqualTo(new MiddleOfLinkedList.ListNode(4, new MiddleOfLinkedList.ListNode(5, new MiddleOfLinkedList.ListNode(6, null))));
    }
    @Test
    public void solveFastPointer() {
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        MiddleOfLinkedList.ListNode head = new MiddleOfLinkedList.ListNode(1, new MiddleOfLinkedList.ListNode(2, new MiddleOfLinkedList.ListNode(3, new MiddleOfLinkedList.ListNode(4, new MiddleOfLinkedList.ListNode(5, null)))));
        MiddleOfLinkedList.ListNode head2 = new MiddleOfLinkedList.ListNode(1, new MiddleOfLinkedList.ListNode(2, new MiddleOfLinkedList.ListNode(3, new MiddleOfLinkedList.ListNode(4, new MiddleOfLinkedList.ListNode(5, new MiddleOfLinkedList.ListNode(6, null))))));
        Assertions.assertThat(middleOfLinkedList.solveFastPointer(head)).isEqualTo(new MiddleOfLinkedList.ListNode(3, new MiddleOfLinkedList.ListNode(4, new MiddleOfLinkedList.ListNode(5, null))));
        Assertions.assertThat(middleOfLinkedList.solveFastPointer(head2)).isEqualTo(new MiddleOfLinkedList.ListNode(4, new MiddleOfLinkedList.ListNode(5, new MiddleOfLinkedList.ListNode(6, null))));
    }
}
