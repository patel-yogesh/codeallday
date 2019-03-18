package com.codeallday.ctci.chapter4.graph;

import org.junit.Test;

public class SimpleBFSTest {
    SimpleBFS simpleBFS = new SimpleBFS(6);

    @Test
    public void testBfs() {
        simpleBFS.addEdge(1, 5);
        simpleBFS.addEdge(2 ,4);
        simpleBFS.addEdge(1,4);
        simpleBFS.addEdge(4, 3);
        simpleBFS.addEdge(3,2);

        simpleBFS.bfs(2);
    }

}
