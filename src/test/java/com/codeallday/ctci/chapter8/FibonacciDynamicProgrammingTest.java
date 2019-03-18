package com.codeallday.ctci.chapter8;

import org.junit.Test;

public class FibonacciDynamicProgrammingTest {
    @Test
    public void testRecursiveFib() {
        System.out.println("Recursive: " + FibonacciDynamicProgramming.recursiveFib(8));
        System.out.println("TopDown DP: " + FibonacciDynamicProgramming.topDownDpFib(8));
        System.out.println("Bottom DP: " + FibonacciDynamicProgramming.bottomUpFib(8));

    }
}
