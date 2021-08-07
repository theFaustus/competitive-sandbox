package com.evil.inc.algoexpert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DuplicatesLinkedListTest {
    public DuplicatesLinkedList.LinkedList addMany(DuplicatesLinkedList.LinkedList ll, List<Integer> values) {
        DuplicatesLinkedList.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new DuplicatesLinkedList.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(DuplicatesLinkedList.LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        DuplicatesLinkedList.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

    @Test
    public void TestCase1() {
        DuplicatesLinkedList.LinkedList input = new DuplicatesLinkedList.LinkedList(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
        DuplicatesLinkedList.LinkedList output = new DuplicatesLinkedList().removeDuplicatesFromLinkedList(input);
        Assertions.assertThat(getNodesInArray(output)).isEqualTo(expectedNodes);
    }
}