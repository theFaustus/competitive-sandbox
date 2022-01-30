package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class BranchSumsTest {


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
    public void branchSums() {
        final BranchSums.BinaryTree bst = new BranchSums.BinaryTree(1);
        final BranchSums.BinaryTree left = new BranchSums.BinaryTree(2);
        bst.left = left;
        final BranchSums.BinaryTree right = new BranchSums.BinaryTree(3);
        bst.right = right;

        final BranchSums.BinaryTree left1 = new BranchSums.BinaryTree(4);
        left.left = left1;
        left1.left = new BranchSums.BinaryTree(8);
        left1.right = new BranchSums.BinaryTree(9);

        final BranchSums.BinaryTree left2 = new BranchSums.BinaryTree(5);
        left.right = left2;
        left2.left = new BranchSums.BinaryTree(10);

        right.left = new BranchSums.BinaryTree(6);
        right.right = new BranchSums.BinaryTree(7);

        Assertions.assertThat(BranchSums.branchSums(bst))
                .isEqualTo(List.of(15, 16, 18, 10, 11));

    }

}
