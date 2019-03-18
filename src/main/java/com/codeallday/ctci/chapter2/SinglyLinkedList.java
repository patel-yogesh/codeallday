package com.codeallday.ctci.chapter2;

import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedList {
    Node head = null;

    SinglyLinkedList(){
    }

    public void addNode(int data) {
        Node node = new Node(data);
        if(head == null) {
            // This is the first node being added to linkedList
            head = node;
        } else {
            // Iterate from the head to last node and append the newly
            // created node at the end
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void deleteNode(int data) {
        Node node = head;

        if(head.data == data) {
            // data is at the head. Move the head and move on
            head = head.next;
        } else {
            while(node != null && node.next != null) {
                if(node.next.data == data) {
                    node.next = node.next.next;
                }
                node = node.next;
            }
        }
    }

    public void printList() {
        Node node = head;
        while(node != null) {
            System.out.print(node.data + "-> ");
            node = node.next;
        }
        System.out.println();
    }

    public void removeDuplicates() {
        Set<Integer> mySet = new HashSet<>();
        Node node = head;
        Node previous = null;
        while(node != null) {
            if(mySet.contains(node.data)) {
                previous.next = node.next;
            } else {
                mySet.add(node.data);
                previous = node;
            }
            node = node.next;
        }
    }

    public void removeDuplicatesWithoutExtraSpace() {
        Node current = head;
        while(current != null) {
            Node runner = current;
            while(runner.next != null) {
                if(runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public Node kthLastElement(int k) {
        Node p1 = head;
        Node p2 = head;

        for(int i=0; i < k; i++) {
            if(p1 == null) return null; // Out of bound
            p1 = p1.next;
        }

        while(p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    public Node kthLastElementRecursive(int k) {
        return kthLastElementRecursiveInner(head, k, new Index());
    }

    private Node kthLastElementRecursiveInner(Node node, int k, Index index) {
        if(node == null) {
            return null;
        }

        Node n = kthLastElementRecursiveInner(node.next, k, index);
        index.value = index.value + 1;
        if(index.value == k) {
            return node;
        }
        return n;
    }

    public void deleteMiddleNode() {
        Node p1 = head;
        Node p2 = head;
        Node previous = p1;
        while(p2 != null && p2.next != null) {
            p2 = p2.next.next;
            previous = p1;
            p1 = p1.next;
        }
        previous.next = p1.next;
    }
}

class Index {
    int value = 0;
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}