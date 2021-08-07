package com.evil.inc.algoexpert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DepthFirstSearch {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            System.out.println(name);
            array.add(name);
            for (final Node child : children) {
                child.depthFirstSearch(array);
            }
            System.out.println(array);
            return array;
        }

        public List<String> depthFirstSearch2(List<String> array) {
            dfs(this, array);
            return array;
        }


        public void dfs(Node root, List<String> input) {
            if (root == null) return;
            input.add(root.name);
            for (final Node child : root.children) {
                dfs(child, input);
            }
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    ", children=" + children +
                    '}';
        }
    }
}
