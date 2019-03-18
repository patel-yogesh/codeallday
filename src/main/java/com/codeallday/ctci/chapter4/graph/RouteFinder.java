package com.codeallday.ctci.chapter4.graph;

import java.util.LinkedList;
import java.util.Queue;

public class RouteFinder {
    public static boolean routeExist(Graph g, Node start, Node end) {
        LinkedList<Node> queue = new LinkedList<Node>();

        for(Node n: g.getNodes()) {
            n.setState(State.Unvisited);
        }

        start.setState(State.Visiting);
        queue.add(start);

        while(!queue.isEmpty()) {
            Node n = queue.removeFirst(); // dequeue
            if(n.equals(end)) {
                return true;
            }

            if(n != null) {
                for (Node adj : n.getAdjacent()) {
                    if (adj.state == State.Unvisited) {
                        queue.add(adj);
                        adj.setState(State.Visiting);
                    }
                }
                n.setState(State.Visited);
            }
        }

        return false;
    }
}
