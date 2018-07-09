package com.codeallday.ctci.chapter1;

/*
    Given an image represented by an NxN matrix, where each pixel in the image
    is 4 bytes, write a method to rotate by 90 degrees, Can you do this in place?

    1(0,0) 2(0,1) 3(0,2)         7(0,0) 4(0,1) 1 (0,2)
    4(1,0) 5(1,1) 6(1,2)   ==>   8(1,0) 5(1,1) 2 (1,2)
    7(2,0) 8(2,1) 9(2,2)         9(2,0) 6(2,1) 3 (2,2)
 */
public class MatrixRotator {
    public static int[][] rotateMatrix(int[][] matrix) {
        // Check if matrix is square?, if it is not, return original matrix back
        if(matrix.length == 0 || matrix.length != matrix[0].length) return matrix;

        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;

            for(int i = first; i < last; i++) {
                int offset = i - first;

                int top = matrix[first][i];

                // top = left
                matrix[first][i] = matrix[last-offset][first];

                // left = bottom
                matrix[last-offset][first] = matrix[last][last-offset];

                // bottom = right
                matrix[last][last-offset] = matrix[i][last];

                // right = top
                matrix[i][last] = top;
            }
        }
        return matrix;
    }
}
