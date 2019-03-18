package com.codeallday.ctci.chapter2;

import org.junit.Test;

public class PalindromeCheckerTest {
    @Test
    public void testPalindromeChecker() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addNode(5);
        singlyLinkedList.addNode(7);
        singlyLinkedList.addNode(9);
        singlyLinkedList.addNode(7);
        singlyLinkedList.addNode(5);
        singlyLinkedList.printList();
        System.out.println("LinkedList Is Palindrome: " + PalindromeChecker.isPalindrome(singlyLinkedList));
        System.out.println("LinkedList Is Palindrome using stack: " +
                PalindromeChecker.isPalindromeUsingStack(singlyLinkedList));
    }
}
