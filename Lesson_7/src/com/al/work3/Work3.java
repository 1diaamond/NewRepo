package com.al.work3;

import java.util.Arrays;

public class Work3 {


    public static void main(String[] args) {
        int [] [] arrTwo = createMatrix(10);
        printMatrix(arrTwo);
    }


    public static int [] [] createMatrix (int size){
        if (size <=1){
            return null;
        }
        int [] [] matrix = new int [size] [size];
        for (int i = 0; i < matrix.length; i++) {
            int value = 1;
            for (int j = 0; j < matrix [i].length; j++) {
                matrix[i] [j] = value;
                value += size;
            }

        }
        return matrix;
    }

    public static void  printMatrix (int [] [] matrix){
        for (int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
