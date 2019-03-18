package com.codeallday.ctci.chapter4;

public class MyBinaryTree {
    Node root = null;

    public MyBinaryTree() {
    }

    public void addNode(int data) {
        this.root = addNode(root, data);
    }

    private Node addNode(Node root, int data) {
        if(root == null) {
            root = new Node(data);
        } else {
            if(data < root.data) {
                root.left = addNode(root.left, data);
            } else if(data > root.data) {
                root.right = addNode(root.right, data);
            } // else - NO op, data already exists in tree, no dup allowed
        }
        return root;
    }

    public void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(Node node) {
        if(node != null) {
            printInOrder(node.left);
            System.out.print("  " + node.data);
            printInOrder(node.right);
        }
    }

    public void printPostOrder() {
        printPostOrder(root);
    }
    private void printPostOrder(Node node) {
        if(node != null) {

            printPostOrder(node.right);
            System.out.print("  " +node.data);
            printPostOrder(node.left);
        }
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
