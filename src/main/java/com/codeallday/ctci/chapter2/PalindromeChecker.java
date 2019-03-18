package com.codeallday.ctci.chapter2;

import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(SinglyLinkedList l1) {
        SinglyLinkedList l2 = reverseAndClone(l1);
        return isEqual(l1, l2);
    }

    public static SinglyLinkedList reverseAndClone(SinglyLinkedList l1) {
        SinglyLinkedList l2 = new SinglyLinkedList();

        Node node = l1.head;
        Node head = l2.head;
        while(node != null) {
            Node newNode = new Node(node.data);
            newNode.next = head;
            head = newNode;
            node = node.next;
        }
        l2.head = head;
        return l2;
    }

    public static boolean isEqual(SinglyLinkedList l1, SinglyLinkedList l2) {
        Node cursor1 = l1.head;
        Node cursor2 = l2.head;
        while(cursor1 != null && cursor2 != null) {
            if(cursor1.data != cursor2.data) return false;
            cursor1 = cursor1.next;
            cursor2 = cursor2.next;
        }
        if(cursor1 == null && cursor2 != null) {
            return false;
        } else if(cursor2 == null && cursor1 != null) {
            return false;
        }

        return true;
    }

    public static boolean isPalindromeUsingStack(SinglyLinkedList list) {
        Node slow = list.head;
        Node fast = list.head;

        Stack<Integer> stack = new Stack<>();
        while(fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        // If Odd number of element, skip middle element
        if(fast != null) {
            slow = slow.next;
        }

        while(slow != null) {
            if(slow.data != stack.pop().intValue()) return false;
            slow = slow.next;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(SinglyLinkedList l1) {
        // TODO - implement this
        return true;
    }
}
