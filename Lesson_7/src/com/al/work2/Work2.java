package com.al.work2;

public class Work2 {
    public static void main(String[] args){
        int [] array = {1,2,3,1,1,1};
        int result = sumOddElementsArray(array);
        System.out.println( result );
        System.out.println(array[1]);
    }


    public static int sumOddElementsArray(int [] array){
        if (array == null || array.length <= 1) {
            return -1;
        }
        int x = 0;
        for (int element: array) {
            if ((element % 2) > 0) {
                x+=element;
            }
        }
        return x;
    }
}
