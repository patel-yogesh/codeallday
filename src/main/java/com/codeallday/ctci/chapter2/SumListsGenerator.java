package com.codeallday.ctci.chapter2;

/*
    Sum Lists: You have two numbers represented by a linked list, where each
    node contains a single digit. The digits are stored in reverse order, such
    that the 1's digit is at the head of the list. Write a function that adds
    the two numbers and returns the sum as a linked list.
 */
public class SumListsGenerator {
    public static SinglyLinkedList list1;
    public static SinglyLinkedList list2;

    SumListsGenerator(SinglyLinkedList l1, SinglyLinkedList l2) {
        list1 = l1;
        list2 = l2;
    }

    public static SinglyLinkedList sumLists(SinglyLinkedList l1, SinglyLinkedList l2) {


        int l1Value = listToValue(l1);
        l1.printList();
        System.out.println("Value of L1 is : " + l1Value);
        int l2Value = listToValue(l2);
        l2.printList();
        System.out.println("Value of L2 is : " + l2Value);

        return valueToList(l1Value + l2Value);

    }

    private static int listToValue(SinglyLinkedList list) {
        int sum = 0;
        Node node = list.head;
        int multiplier = 1;
        while(node != null) {
            sum = sum + node.data * multiplier;
            multiplier = multiplier * 10;
            node = node.next;
        }
        return sum;
    }

    private static SinglyLinkedList valueToList(int value) {
        SinglyLinkedList result = new SinglyLinkedList();
        int divider = 10;
        while(value > 0) {
            result.addNode(value % divider);
            value = value / 10;
        }
        return result;
    }

}


