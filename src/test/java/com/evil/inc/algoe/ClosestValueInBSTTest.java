package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ClosestValueInBSTTest {

    /*
    Sample Input
    tree =   10
           /     \
          5      15
        /   \   /   \
       2     5 13   22
     /           \
    1            14
    target = 12
    Sample Output
    13
    */

    @Test
    public void findClosestValueInBst() {
        final ClosestValueInBST.BST bst = new ClosestValueInBST.BST(10);
        final ClosestValueInBST.BST left = new ClosestValueInBST.BST(5);
        bst.left = left;
        final ClosestValueInBST.BST right = new ClosestValueInBST.BST(15);
        bst.right = right;
        final ClosestValueInBST.BST left1 = new ClosestValueInBST.BST(2);
        left.left = left1;
        left1.left = new ClosestValueInBST.BST(1);
        left.right = new ClosestValueInBST.BST(5);
        final ClosestValueInBST.BST left2 = new ClosestValueInBST.BST(13);
        right.left = left2;
        left2.right = new ClosestValueInBST.BST(14);
        right.right = new ClosestValueInBST.BST(22);

        Assertions.assertThat(ClosestValueInBST.findClosestValueInBst(bst, 12)).isEqualTo(13);
    }


    @Test
    public void findClosestValueInBst2() {
        final ClosestValueInBST.BST bst = new ClosestValueInBST.BST(10);
        final ClosestValueInBST.BST left = new ClosestValueInBST.BST(5);
        bst.left = left;
        final ClosestValueInBST.BST right = new ClosestValueInBST.BST(15);
        bst.right = right;
        final ClosestValueInBST.BST left1 = new ClosestValueInBST.BST(2);
        left.left = left1;
        left1.left = new ClosestValueInBST.BST(1);
        left.right = new ClosestValueInBST.BST(5);
        final ClosestValueInBST.BST left2 = new ClosestValueInBST.BST(13);
        right.left = left2;
        left2.right = new ClosestValueInBST.BST(14);
        right.right = new ClosestValueInBST.BST(22);

        Assertions.assertThat(ClosestValueInBST.findClosestValueInBst2(bst, 12)).isEqualTo(13);
    }
}
