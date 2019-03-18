package com.codeallday.ctci.chapter4;

import org.junit.Test;

public class MyBinaryTreeTest {
    @Test
    public void testMyBinaryTreeInOrderPrint() {
        MyBinaryTree tree = new MyBinaryTree();
        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(10);
        tree.addNode(2);
        tree.addNode(100);
        tree.addNode(1);
        tree.printInOrder();
        System.out.println();
        tree.printPostOrder();
    }
}
