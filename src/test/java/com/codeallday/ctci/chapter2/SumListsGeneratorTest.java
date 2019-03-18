package com.codeallday.ctci.chapter2;

import org.junit.Test;

public class SumListsGeneratorTest {
    @Test
    public void testSumListGenerator() {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.addNode(7);
        list1.addNode(1);
        list1.addNode(6);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addNode(5);
        list2.addNode(9);
        list2.addNode(2);

        SinglyLinkedList result = SumListsGenerator.sumLists(list1,list2);
        System.out.print("\nSum of the list is : ");
        result.printList();
    }
}
