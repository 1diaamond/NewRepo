package com.al.work5;

import java.util.Scanner;

public class Work5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text");
        String text = sc.nextLine();
        int index = 0;
        while (index< text.length()) {
            char ch = text.charAt(index);
            if (text.indexOf(ch) == text.lastIndexOf(ch)) {
                System.out.print(ch);
            }
        index++;
        }
    }
}
