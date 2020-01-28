package com.al.work3;

import java.nio.channels.ClosedByInterruptException;

public class Work3 {
    public static void main(String[] args) {
        int line = 1;

        while (line <=8 ) {
            int number = line;
            while (number >= 1) {
                System.out.print (number + " ");
                number--;
            }
            System.out.println();
            line++;
        }
    }
}
