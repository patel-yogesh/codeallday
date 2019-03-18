package com.codeallday.ctci.chapter8;

/*
    get nth Fibonacci number
 */
public class FibonacciDynamicProgramming {
    public static int recursiveFib (int n) {
        if(n == 0) return 0;
        else if (n == 1) return 1;
        else return recursiveFib(n-1) + recursiveFib(n-2);
    }

    public static int topDownDpFib(int n) {
        int[] mem = new int[n+1];
        return topDownfib(n, mem);
    }

    private static int topDownfib(int n, int[] mem) {
        if(n==0 || n==1) return n;

        if(mem[n] ==0) {
            mem[n] = topDownfib(n-1, mem) + topDownfib(n-2, mem);
        }
        return mem[n];
    }

    public static int bottomUpFib(int n) {
        if(n == 0 || n == 1 ) return n;

        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 2; i < n+1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
