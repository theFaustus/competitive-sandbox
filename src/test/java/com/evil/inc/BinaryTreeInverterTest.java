package com.evil.inc;

import org.junit.Test;

import static com.evil.inc.BinaryTreeInverter.*;
import static org.assertj.core.api.Assertions.assertThat;


public class BinaryTreeInverterTest {

    /*
    *        1
    *     2    6
    *   4   7 3  9
    *
    * */

    @Test
    public void testInvert(){

        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(7);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(9);

        TreeNode a = new TreeNode(2, c, d);
        TreeNode b = new TreeNode(6, e, f);

        TreeNode z = new TreeNode(1, a, b);

        assertThat("9 6 3 1 7 2 4 ").isEqualTo(toStringInorder(BinaryTreeInverter.invert(z)));

        System.out.println(toStringInorder(z));
    }

    public String toStringInorder(TreeNode root) {
        String s = "";
        if (root == null) {
            return "";
        }

        s += toStringInorder(root.left);
        s += root.toString();
        s += toStringInorder(root.right);
        return s;
    }

    public String toStringPreorder(TreeNode root) {
        String s = "";
        if (root == null) {
            return "";
        }

        s += root.toString();
        s += toStringPreorder(root.left);
        s += toStringPreorder(root.right);
        return s;
    }

    public String toStringPostOrder(TreeNode root) {
        String result = "";
        if (root == null) {
            return "";
        }

        result += toStringPostOrder(root.left);
        result += toStringPostOrder(root.right);
        result += root.toString();
        return result;
    }
}