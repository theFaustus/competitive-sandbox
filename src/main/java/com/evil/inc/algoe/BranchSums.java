package com.evil.inc.algoe;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class BranchSums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        iterativeDFS(root);
        final ArrayList<Integer> sums = new ArrayList<>();
        branchingSum(root, 0, sums);
        return sums;
    }

    public static void dfs(BinaryTree tree){
        if(tree == null) return;
        dfs(tree.left);
        dfs(tree.right);
    }

    public static void iterativeDFS(BinaryTree tree){
        Stack<BinaryTree> stack = new Stack<>();
        Set<BinaryTree> visited = new HashSet<>();

        stack.push(tree);
        visited.add(tree);

        while (!stack.isEmpty()){
            final BinaryTree popped = stack.pop();
            System.out.println(popped.value);
            if(popped.right != null && !visited.contains(popped.right)){
                visited.add(popped.right);
                stack.push(popped.right);
            }
            if(popped.left != null && !visited.contains(popped.left)){
                visited.add(popped.left);
                stack.push(popped.left);
            }
        }

    }

    public static void bfs(BinaryTree tree){
        Queue<BinaryTree> queue = new ArrayDeque<>();
        Set<BinaryTree> visited = new HashSet<>();
        queue.offer(tree);
        visited.add(tree);
        while (!queue.isEmpty()){
            final BinaryTree polled = queue.poll();
            System.out.println(polled.value);
            if(polled.left != null && !visited.contains(polled.left)){
                queue.offer(polled.left);
                visited.add(polled.left);
            }
            if(polled.right != null && !visited.contains(polled.right)){
                queue.offer(polled.right);
                visited.add(polled.right);
            }
        }

    }

    public static void branchingSum(BinaryTree tree, int sum, List<Integer> sums){
        if(tree == null) {
            return;
        }
        sum += tree.value;
        if(tree.left == null && tree.right == null){
            sums.add(sum);
            return;
        }
        branchingSum(tree.left, sum, sums);
        branchingSum(tree.right, sum, sums);
    }
}
