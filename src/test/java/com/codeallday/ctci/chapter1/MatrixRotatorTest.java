package com.codeallday.ctci.chapter1;

import org.junit.Test;

public class MatrixRotatorTest {
    @Test
    public void testRotateMatrix() {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        printMatrix(matrix);
        MatrixRotator.rotateMatrix(matrix);
        printMatrix(matrix);
    }

    public void printMatrix(int[][] matrix) {
        System.out.println();
        for(int i=0; i<matrix.length; i++) {
            for(int j = 0; j<matrix.length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
