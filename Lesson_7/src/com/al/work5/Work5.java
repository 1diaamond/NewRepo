package com.al.work5;

import java.util.Arrays;

public class Work5 {
    public static void main(String[] args) {
        int[] res = countOfSequenceNumbers("268168tyf7yug266252");
        System.out.println(Arrays.toString(res));
    }

    public static int[] countOfSequenceNumbers(String numbers) {
        int[] result = new int [10];
        String digits = "0123456789";
        for (int i = 0; i < numbers.length(); i++) {
            char symbol = numbers.charAt(i);
            int  index = digits.indexOf(symbol);
            if (index != -1){
                result[index]++;
            }
        }
        return result;
    }
}
