package com.naveen.interviewBit.graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class DFS {

    private boolean isVisited[];
    private Graph graph;
    private Stack<Integer> stack = new Stack<>();
    public DFS(int nodes, Graph graph) {
        this.isVisited = new boolean[nodes*nodes];
        this.graph = graph;
        Arrays.fill(isVisited,false);
    }

    public void dfsTraverse(int root) {
        if (isVisited[root]) return;
        isVisited[root] =true;
        System.out.print(root + " ");
        LinkedList<Integer> edges = graph.getEdges(root);
        if (edges != null)
        edges.forEach(integer -> {
            dfsTraverse(integer);

        });

        System.out.println();
        stack.push(root);

    }
}
