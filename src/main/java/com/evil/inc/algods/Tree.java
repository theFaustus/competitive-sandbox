package com.evil.inc.algods;

import java.util.*;

public class Tree<T> {
    private T value;
    private List<Tree<T>> children;

    public Tree(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public static <T> Tree<T> of(T value) {
        return new Tree<>(value);
    }


    public static <T> Optional<Tree<T>> searchDFS(T value, Tree<T> root) {
        Deque<Tree<T>> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Tree<T> currentNode = stack.pop();
            System.out.println(currentNode);
            if (currentNode.getValue().equals(value)) {
                return Optional.of(currentNode);
            } else {
                currentNode.getChildren().forEach(stack::push);
            }
        }
        return Optional.empty();
    }

    public static <T> Optional<Tree<T>> searchBFS(T value, Tree<T> root) {
        Queue<Tree<T>> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Tree<T> currentNode = queue.poll();
            System.out.println(currentNode);
            if (currentNode.getValue().equals(value)) {
                return Optional.of(currentNode);
            } else {
                queue.addAll(currentNode.getChildren());
            }
        }
        return Optional.empty();
    }

    public Tree<T> addChild(T value) {
        Tree<T> newChild = new Tree<>(value);
        children.add(newChild);
        return newChild;
    }

    public Tree<T> addChild(Tree<T> child) {
        children.add(child);
        return child;
    }

    public T getValue() {
        return value;
    }

    public List<Tree<T>> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "value=" + value +
                ", children=" + children +
                '}';
    }
}
