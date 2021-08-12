package com.evil.inc.pramp;

public class HondaMinimumSalesPath {
    static class Node {
        int cost;
        Node[] children;
        Node parent;

        Node(int cost) {
            this.cost = cost;
            children = null;
            parent = null;
        }

        public void setChildren(final Node[] children) {
            this.children = children;
            for (final Node child : children) {
                child.parent = this;
            }
        }
    }

    static class SalesPath {
        static int minimumCost = Integer.MAX_VALUE;

        static int getCheapestCost(Node rootNode){
            minimumCost(rootNode, 0);
            return minimumCost;
        }

        private static void minimumCost(Node node, int currentCost){
            if(node.children == null){
                currentCost += node.cost;
                if (currentCost < minimumCost){
                    minimumCost = currentCost;
                }
                return;
            }
            currentCost += node.cost;
            for (final Node child : node.children) {
                minimumCost(child, currentCost);
            }
        }
    }

    public static void main(String[] args) {
        final Node parent = new Node(0);
        final Node node5 = new Node(5);
        final Node node3 = new Node(3);
        final Node node6 = new Node(6);
        parent.setChildren(new Node[]{node5, node3, node6});
        node5.setChildren(new Node[]{new Node(4)});
        node6.setChildren(new Node[]{new Node(1), new Node(5)});
        final Node node0 = new Node(0);
        final Node node2 = new Node(2);
        node3.setChildren(new Node[]{node2, node0});
        node0.setChildren(new Node[]{new Node(10)});
        final Node node1 = new Node(1);
        node2.setChildren(new Node[]{node1});
        node1.setChildren(new Node[]{new Node(1)});

        System.out.println("min:" + SalesPath.getCheapestCost(parent));

    }
}
