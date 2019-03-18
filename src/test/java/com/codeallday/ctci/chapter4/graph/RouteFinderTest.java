package com.codeallday.ctci.chapter4.graph;

import org.junit.Test;

public class RouteFinderTest {
    @Test
    public void testRouteFinder() {
        Graph graph = new Graph();
        graph.addEdge("1", "4");
        graph.addEdge("4", "3");
        graph.addEdge("3" ,"2");
        graph.addEdge("2", "5");
        graph.addEdge("5", "7");

        assert (RouteFinder.routeExist(graph, graph.nodes.get("1"), new Node("7")));
    }
}
