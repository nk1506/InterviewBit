package com.naveen.interviewBit.graphs;

import java.util.LinkedList;

public class Graph {
    //Adjacency List
    private LinkedList[] linkedList;
    private int noOfNode;

    public Graph(int noOfNode) {
        this.noOfNode = noOfNode;
        linkedList = new LinkedList[noOfNode*noOfNode];
        for (int i = 0; i <noOfNode ; i++) {
            linkedList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int i, int j) {
        LinkedList<Integer> edges = linkedList[i];
        edges.add(j);
    }

    public LinkedList<Integer> getEdges(int v) {
        return linkedList[v];
    }

    public void printGraph() {
        for (int i = 0; i <noOfNode ; i++) {
            LinkedList<Integer> edges = linkedList[i];
            System.out.print(i + ": ");
            edges.forEach(integer -> System.out.print(integer+" "));
            System.out.println();
        }
    }
}
