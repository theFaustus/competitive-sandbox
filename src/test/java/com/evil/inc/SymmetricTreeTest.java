package com.evil.inc;

import com.evil.inc.SymmetricTree.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SymmetricTreeTest {

    @Test
    public void isSymmetric() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        TreeNode treeNode2 = new TreeNode(1, new TreeNode(2, new TreeNode(7), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        TreeNode treeNode3 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2));

        Assertions.assertThat(SymmetricTree.isSymmetricBFS(treeNode)).isTrue();
        Assertions.assertThat(SymmetricTree.isSymmetricBFS(treeNode2)).isFalse();
        Assertions.assertThat(SymmetricTree.isSymmetricBFS(treeNode3)).isFalse();
    }
}