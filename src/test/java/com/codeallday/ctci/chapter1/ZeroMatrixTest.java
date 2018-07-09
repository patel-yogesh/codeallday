package com.codeallday.ctci.chapter1;

import org.junit.Test;

public class ZeroMatrixTest {
    @Test
    public void testZeroMatrix() {
        int[][] matrix = {{1,2,3},{4,0,5},{8,9,0}};
        printMatrix(matrix);
        ZeroMatrix.detectAndMakeRowColumnZero(matrix);
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
