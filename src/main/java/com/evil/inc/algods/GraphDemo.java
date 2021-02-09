package com.evil.inc.algods;

public class GraphDemo {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode(new Graph.Node(1));
        graph.addNode(new Graph.Node(2));
        graph.addNode(new Graph.Node(3));
        graph.addNode(new Graph.Node(4));
        graph.addNode(new Graph.Node(5));
        graph.addNode(new Graph.Node(6));
        graph.addNode(new Graph.Node(7));
        graph.addNode(new Graph.Node(8));
        graph.addNode(new Graph.Node(9));

        graph.addEdge(1, 2);
        graph.addEdge(3, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 6);
        graph.addEdge(2, 5);
        graph.addEdge(2, 7);
        graph.addEdge(4, 7);
        graph.addEdge(4, 8);
        graph.addEdge(5, 9);
        graph.addEdge(7, 9);

        System.out.println(graph);
        System.out.println(graph.hasPathBFS(1, 7));
        System.out.println(graph.hasPathBFS(1, 6));
        System.out.println(graph.hasPathBFS(4, 8));
        System.out.println(graph.hasPathBFS(4, 9));
        System.out.println(graph.hasPathBFS(4, 2));
        System.out.println(graph.hasPathBFS(6, 9));
        System.out.println();
        System.out.println(graph.hasPathDFS(1, 7));
        System.out.println(graph.hasPathDFS(1, 6));
        System.out.println(graph.hasPathDFS(4, 8));
        System.out.println(graph.hasPathDFS(4, 9));
        System.out.println(graph.hasPathDFS(4, 2));
        System.out.println(graph.hasPathDFS(6, 9));
    }
}
