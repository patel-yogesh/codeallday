package com.codeallday.ctci.chapter4.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
    Route Between Nodes: Given a directed graph, design an algorithm to find out
    wheather there a route between two nodes.
 */
public class SimpleBFS {
    MyGraph graph = null;
    SimpleBFS(int numberOfVertices) {
        graph = new MyGraph(numberOfVertices);
    }

    public void addEdge(int a, int b) {
        graph.addEdge(a, b);
    }

    public void bfs(int s) {
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean visited[] = new boolean[graph.v];

        visited[s] = true;
        queue.add(s);

        while(!queue.isEmpty()) {
            Integer r = queue.poll();
            System.out.println(r);
            Iterator<Integer> iter = graph.adj[r].listIterator();
            while(iter.hasNext()) {
                Integer n = iter.next();
                if(visited[n] == false) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}

class MyGraph {
    int v;
    LinkedList<Integer> adj[];

    MyGraph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for(int i= 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }
}
