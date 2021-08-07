package com.evil.inc.algoexpert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeDepthsTest {

        /*
        tree =     1
                /     \
               2       3
             /   \    /  \
            4     5  6    7
          /   \  /
         8    9 10
    * */

    @Test
    public void nodeDepths() {

        final NodeDepths.BinaryTree bst = new NodeDepths.BinaryTree(1);
        final NodeDepths.BinaryTree left = new NodeDepths.BinaryTree(2);
        bst.left = left;
        final NodeDepths.BinaryTree right = new NodeDepths.BinaryTree(3);
        bst.right = right;

        final NodeDepths.BinaryTree left1 = new NodeDepths.BinaryTree(4);
        left.left = left1;
        left1.left = new NodeDepths.BinaryTree(8);
        left1.right = new NodeDepths.BinaryTree(9);

        left.right = new NodeDepths.BinaryTree(5);

        right.left = new NodeDepths.BinaryTree(6);
        right.right = new NodeDepths.BinaryTree(7);

        Assertions.assertThat(NodeDepths.nodeDepths(bst)).isEqualTo(16);
    }
}