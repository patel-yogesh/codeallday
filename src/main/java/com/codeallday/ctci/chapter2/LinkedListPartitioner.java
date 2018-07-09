package com.codeallday.ctci.chapter2;

public class LinkedListPartitioner {
    private static SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    public LinkedListPartitioner(int... data) {
        for(int d: data) {
            singlyLinkedList.addNode(d);
        }
    }

    public static void partitionLinkedList(int x) {
        Node current = singlyLinkedList.head;
        Node head = singlyLinkedList.head;
        Node tail = singlyLinkedList.head;

        while(current != null) {
            Node nextNode = current.next;
            if(current.data < x) {
                current.next = head;
                head = current;
            } else {
                tail.next = current;
                tail = current;
            }
            current = nextNode;
        }
        singlyLinkedList.head = head;
    }

    public static void printList() {
        singlyLinkedList.printList();
    }
}
