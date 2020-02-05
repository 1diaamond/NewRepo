package com.al.work4;

import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        System.out.println(convertDecimalToBinary(num));
    }
    public static String convertDecimalToBinary (int number) {
        String z = "";
        while (number > 0 ) {
            if ((number % 2) > 0) {
                z = "1" + z;
            } else {
                z = "0" + z;
            }
            number /= 2;
        }
        return z;
    }
}
