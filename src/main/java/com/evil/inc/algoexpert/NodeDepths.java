package com.evil.inc.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class NodeDepths {
    public static int nodeDepths(BinaryTree root) {
//        int depth = -1;
//        List<Integer> depthSums = new ArrayList<>();
//        dfs(root, depth, depthSums);
//        return depthSums.stream().mapToInt(Integer::intValue).sum();
        int depth = 0;
        return dfs(root, depth);
    }

    public static int dfs(BinaryTree root, int depth) {
        if (root == null) return 0;
        return depth + dfs(root.left, depth + 1) + dfs(root.right, depth + 1);
    }


    public static void dfs(BinaryTree root, int depth, List<Integer> depthSums) {
        if (root == null) return;
        depth++;
        depthSums.add(depth);
        dfs(root.left, depth, depthSums);
        dfs(root.right, depth, depthSums);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
