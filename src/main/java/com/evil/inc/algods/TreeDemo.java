package com.evil.inc.algods;

public class TreeDemo {
    public static void main(String[] args) {

        /*
        *              1
        *    2         3          4
        * 5 6 7     8 9 10    11  12  13
        *
        *
        * */
        Tree<Integer> integers = new Tree<>(1);
        Tree<Integer> child2 = new Tree<>(2);
        child2.addChild(5);
        child2.addChild(6);
        child2.addChild(7);
        integers.addChild(child2);

        Tree<Integer> child3 = new Tree<>(3);
        child3.addChild(8);
        child3.addChild(9);
        child3.addChild(10);
        integers.addChild(child3);

        Tree<Integer> child4 = new Tree<>(4);
        child4.addChild(11);
        child4.addChild(12);
        child4.addChild(13);
        integers.addChild(child4);

        Tree.searchDFS(9, integers).ifPresent(v -> System.out.println("DFS: " + v.getValue()));
        Tree.searchBFS(9, integers).ifPresent(v -> System.out.println("BFS: " +v.getValue()));
    }
}
