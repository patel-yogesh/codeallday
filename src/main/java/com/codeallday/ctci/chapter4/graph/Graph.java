package com.codeallday.ctci.chapter4.graph;

import java.util.*;

public class Graph {
    public Map<String, Node> nodes = null;

    public Graph() {
        nodes = new HashMap<>();
    }

    public void addEdge(String a, String b) {
        if(nodes.get(a) == null) {
            nodes.put(a, new Node(a));
        }

        if(nodes.get(b) == null) {
            nodes.put(b, new Node(b));
        }

        nodes.get(a).addChild(nodes.get(b));
    }

    public Collection<Node> getNodes() {
        return nodes.values();
    }
}

enum State {Unvisited, Visited, Visiting;}

class Node {
    String name;
    LinkedList<Node> children;

    State state;

    Node(String name) {
        this.name = name;
        children = new LinkedList<Node>();
    }

    void addChild(Node node) {
        children.add(node);
    }

    public void setState(State state) {
        this.state = state;
    }

    public Collection<Node> getAdjacent() {
        return children;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof Node))  {
            return false;
        }
        return name.equalsIgnoreCase(((Node) obj).name);
    }
}

class Edge {
    Node from;
    Node to;
    Edge(Node from, Node to) {
        this.from = from;
        this.to = to;
    }
}
