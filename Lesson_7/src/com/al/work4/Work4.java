package com.al.work4;

import java.util.Arrays;

public class Work4 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(3) ;
        printMatrix(matrix);
        transpositionMatrix(matrix);
        System.out.println("---------------------");
        printMatrix(matrix);
    }

    public static int[][] createMatrix(int size){
        if (size <= 1){
            return null;
        }
        int [] [] arr = new int [size] [size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr [i] [j] = (int) (Math.random()*100) - 50;
            }
        }
        return arr;
    }

    public static void  printMatrix (int [] [] matrix){
        for (int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }


    public static void transpositionMatrix(int[][] matrix){
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][j];
                matrix[j][i] = temp;
            }
        }
    }

}
