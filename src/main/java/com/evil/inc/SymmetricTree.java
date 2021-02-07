package com.evil.inc;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;

public class SymmetricTree {
    /**
     * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
     * <p>
     * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
     * <p>
     * 1
     * / \
     * 2   2
     * / \ / \
     * 3  4 4  3
     * <p>
     * <p>
     * But the following [1,2,2,null,3,null,3] is not:
     * <p>
     * 1
     * / \
     * 2   2
     * \   \
     * 3    3
     */
    public static boolean isSymmetricBFS(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode mirrorNode = queue.poll();

            if (node == null && mirrorNode == null) continue;
            if (node == null || mirrorNode == null) return false;
            if (node.val != mirrorNode.val) return false;

            queue.offer(node.left);
            queue.offer(mirrorNode.right);
            queue.offer(node.right);
            queue.offer(mirrorNode.left);
        }

        return true;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


