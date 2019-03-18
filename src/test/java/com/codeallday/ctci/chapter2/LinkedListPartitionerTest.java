package com.codeallday.ctci.chapter2;

import org.junit.Test;

public class LinkedListPartitionerTest {
    @Test
    public void testLinkedListPartitioner() {
        LinkedListPartitioner linkedListPartitioner =
                new LinkedListPartitioner(3,2,5,4,7,1,9,10);

        linkedListPartitioner.printList();
        linkedListPartitioner.partitionLinkedList(1);
        linkedListPartitioner.printList();
    }
}
