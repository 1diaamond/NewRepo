package com.al.work5;

public class Work5 {
    public static void main(String[] args) {
        System.out.println("* | 1 2 3 4 5 6 7 8 9");
        int raw = 1;
        while (raw < 10) {
            System.out.print(raw + " | ");
            int mult = 2;
            while (mult < 10) {
                int result = mult * raw;
                System.out.print(result+" ");
                mult++;
            }
        System.out.println();
        raw++;
        }
    }
}