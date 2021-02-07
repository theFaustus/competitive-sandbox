package com.evil.inc.algods;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.Collectors;


public class Graph {
    private final Map<Integer, Node> nodes = new HashMap<>();

    private Node getNode(int id) {
        return nodes.get(id);
    }

    public void addNode(Node node) {
        nodes.put(node.id, node);
    }

    public void addEdge(int source, int destination) {
        Node sourceNode = getNode(source);
        Node destinationNode = getNode(destination);
        sourceNode.adjacent.add(destinationNode);
    }

    public boolean hasPathBFS(int source, int destination) {
        Node sourceNode = getNode(source);

        Queue<Node> nodesToVisit = new LinkedList<>();
        HashSet<Node> visitedNodes = new HashSet<>();
        nodesToVisit.offer(sourceNode);
        while (!nodesToVisit.isEmpty()) {
            Node node = nodesToVisit.poll();
            if (visitedNodes.contains(node) || node == null) continue;
            if (node.id == destination) return true;
            nodesToVisit.addAll(node.adjacent);
            visitedNodes.add(node);
        }
        return false;
    }

    public boolean hasPathDFS(int source, int destination) {
        HashSet<Node> visitedNodes = new HashSet<>();
        return hasPathVisitingDFS(source, destination, visitedNodes);
    }

    private boolean hasPathVisitingDFS(int source, int destination, HashSet<Node> visitedNodes) {
        Node node = getNode(source);

        if (visitedNodes.contains(node))
            return false;
        visitedNodes.add(node);

        if (node != null) {
            if (node.id == destination)
                return true;

            for (Node adjacentNode : node.adjacent) {
                if (hasPathVisitingDFS(adjacentNode.id, destination, visitedNodes))
                    return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        nodes.forEach((k, v) -> stringBuilder.append(k).append(" -> ").append(v.adjacent.stream().map(n -> n.id).collect(Collectors.toList())).append("\n"));
        return stringBuilder.toString();
    }

    static class Node {
        private final int id;
        private final LinkedList<Node> adjacent = new LinkedList<>();

        public Node(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return id == node.id && Objects.equals(adjacent, node.adjacent);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, adjacent);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "id=" + id + '}';
        }
    }


}