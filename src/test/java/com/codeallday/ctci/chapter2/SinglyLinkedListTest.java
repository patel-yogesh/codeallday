package com.codeallday.ctci.chapter2;

import org.junit.Test;

import java.util.LinkedList;

public class SinglyLinkedListTest {
    @Test
    public void testCreateAndPrintLinkedList(){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.addNode(4);
        linkedList.addNode(9);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.printList();
        linkedList.deleteNode(9);
        linkedList.printList();
        linkedList.deleteNode(5);
        linkedList.printList();
        linkedList.deleteNode(3);
        linkedList.printList();
    }

    @Test
    public void testRemoveDuplicates(){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.addNode(5);
        linkedList.addNode(5);
        linkedList.addNode(4);
        linkedList.addNode(5);
        linkedList.addNode(5);
        linkedList.addNode(5);
        linkedList.addNode(5);
        linkedList.printList();
        linkedList.removeDuplicates();
        linkedList.printList();
    }

    @Test
    public void testRemoveDuplicatesWithoutExtraSpace(){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.addNode(4);
        linkedList.addNode(5);
        linkedList.addNode(3);
        linkedList.addNode(5);
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.addNode(5);
        linkedList.printList();
        linkedList.removeDuplicatesWithoutExtraSpace();
        linkedList.printList();
    }

    @Test
    public void testKthLastElement() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.addNode(7);
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        System.out.println(linkedList.kthLastElement(3).data);
        System.out.println(linkedList.kthLastElementRecursive(3).data);
        linkedList.deleteMiddleNode();
        linkedList.printList();
    }
}
