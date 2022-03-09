package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BSTTest {

    @Test
    public void bst() {
        var root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(5);
        root.right = new BST(15);
        root.right.left = new BST(13);
        root.right.left.right = new BST(14);
        root.right.right = new BST(22);

        root.insert(12);
        Assertions.assertThat(root.right.left.left.value == 12).isTrue();
        Assertions.assertThat(root.contains(15)).isTrue();

        root.remove(10);
        Assertions.assertThat(!root.contains(10)).isTrue();
        Assertions.assertThat(root.value == 12).isTrue();
    }
}
