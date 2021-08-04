package com.evil.inc.algoexpert;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class ClosestValueInBST {
    public static int findClosestValueInBst(BST tree, int target) {
        Queue<BST> nodesToVisit = new LinkedList<>();
        HashSet<BST> visitedNodes = new HashSet<>();
        nodesToVisit.offer(tree);
        int closestElement = tree.value;
        int currentDifference = Math.abs(target - tree.value);
        while (!nodesToVisit.isEmpty()) {
            final BST node = nodesToVisit.poll();
            if (visitedNodes.contains(node) || node == null) continue;
            nodesToVisit.add(node.left);
            nodesToVisit.add(node.right);
            visitedNodes.add(node);
            final int difference = target - node.value;
            if(Math.abs(difference) <= currentDifference) {
                currentDifference = Math.abs(difference);
                closestElement = node.value;
            }
        }
        return closestElement;
    }

    public static int findClosestValueInBst2(BST tree, int target) {
        int closest = tree.value;
        BST currentNode = tree;
        while (currentNode != null){
            if (Math.abs(target - closest) > Math.abs(target - currentNode.value)){
                closest = currentNode.value;
            }
            if (target < currentNode.value) {
                currentNode = currentNode.left;
            } else if(target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                break;
            }
        }
        return closest;
    }


    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
