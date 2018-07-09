package com.codeallday.ctci.chapter1;

/*
    Write an algorithm such that if an element in an MxN matrix is 0, its
    entire row and column are set to 0.
 */
public class ZeroMatrix {
    public static void detectAndMakeRowColumnZero(int[][] matrix) {
        // Iterate over matrix and find rows and column with 0 present
        boolean row[] = new boolean[matrix.length];
        boolean column[] = new boolean[matrix[0].length];

        for(int i=0; i < matrix.length; i++) {
            for(int j=0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // Now we know which row and column needs to be nullified

        // Iterate over rows and nullify where it applies
        for(int i = 0; i < row.length; i++) {
            if(row[i] == true) nullifyRow(matrix, i);
        }

        // Iterate over column and nullify where it applies
        for(int j=0; j < column.length; j++) {
            if(column[j] == true) nullifyColumn(matrix, j);
        }

    }

    private static void nullifyRow(int[][]matrix, int row) {
        for (int j=0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }

    public static void nullifyColumn(int[][]matrix, int column) {
        for(int i=0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }


}
