package com.evil.inc.algoe;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesLinkedList {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        Set<Integer> uniqueIntegers = new HashSet<>();
        LinkedList currentNode = linkedList;
        LinkedList previousNode = null;
        while (currentNode != null){
            if(uniqueIntegers.contains(currentNode.value)) {
                previousNode.next = currentNode.next;
            } else {
                uniqueIntegers.add(currentNode.value);
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        System.out.println(uniqueIntegers);
        return linkedList;
    }
}
