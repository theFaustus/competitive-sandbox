package com.evil.inc;


public class BinaryTreeInverter {
    public static TreeNode invert(TreeNode root) {
        if (root != null) {
            TreeNode tempLeft = root.left;
            root.left = root.right;
            root.right = tempLeft;
            invert(root.left);
            invert(root.right);
        }
        return root;
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

        @Override
        public String toString() {
            return val + " ";
        }
    }


}


