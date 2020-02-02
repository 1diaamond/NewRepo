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
        while ((number/2) > 0 ) {
            if ((number % 2) > 0) {
                z += "1";
            } else {
                z += "0";
            }
            number /= 2;
        }
        z+="1";
        StringBuffer sb = new StringBuffer(z);
        String x = "" + sb.reverse();
        return x;
    }
}
