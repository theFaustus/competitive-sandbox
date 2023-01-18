package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicatesFromSortedListTest {

    @Test
    public void deleteDuplicates() {
        DuplicatesFromSortedList duplicatesFromSortedList = new DuplicatesFromSortedList();
        DuplicatesFromSortedList.ListNode head = new DuplicatesFromSortedList.ListNode(1, new DuplicatesFromSortedList.ListNode(1, new DuplicatesFromSortedList.ListNode(2, null)));
        DuplicatesFromSortedList.ListNode head2 = new DuplicatesFromSortedList.ListNode(1, new DuplicatesFromSortedList.ListNode(1, new DuplicatesFromSortedList.ListNode(2, new DuplicatesFromSortedList.ListNode(3, new DuplicatesFromSortedList.ListNode(3, null)))));
        DuplicatesFromSortedList.ListNode expected = new DuplicatesFromSortedList.ListNode(1, new DuplicatesFromSortedList.ListNode(2, null));
        DuplicatesFromSortedList.ListNode expected2 = new DuplicatesFromSortedList.ListNode(1, new DuplicatesFromSortedList.ListNode(2, new DuplicatesFromSortedList.ListNode(3, null)));

        Assertions.assertThat(duplicatesFromSortedList.deleteDuplicates(head2)).isEqualTo(expected2);
        Assertions.assertThat(duplicatesFromSortedList.deleteDuplicates(head)).isEqualTo(expected);
    }
}
