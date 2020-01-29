package com.al.work6;

import java.util.Scanner;

public class Work6 {
    public static void main(String[] args) {
        System.out.println("Введите число ==>");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 0;
        // x = x < 0 ? -x: x; терн. операция
        if (x < 0) {
            x=-x;
        }
        while (x > 0) {
            int y = x % 10;
            x /= 10;
            y*=y;
            result += y;
        }
        System.out.println(result);
    }
}
