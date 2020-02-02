package com.al.work2;

import java.util.Scanner;

public class Work2 {
        public static String getLatestDigit(int number) {
            String numStr = String.valueOf (number);
            if (numStr.length() < 2){
                System.out.println(" invalid args");
                return null;
            }
            String digits = numStr.substring(numStr.length()-2);
            return "" + digits.charAt(1) + digits.charAt(0);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" put the numer");
        int number = sc.nextInt();
        System.out.println("Digits = " + getLatestDigit(number));
    }
}
