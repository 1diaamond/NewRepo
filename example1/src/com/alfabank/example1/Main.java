package com.alfabank.example1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
//        System.out.print("Enter name -> ");
        String symbol = scanner.next();
//        System.out.println("Hello "+ name);

        /* System.out.println("* * * *\n"
                + "* \n"
                + "* \n"
                + "* * \n"
                + "* \n"
                + "* \n"
                + "* * * *"
        ); */

        System.out.println(symbol + " " + symbol + " "  + symbol + " "  + symbol + " "
                + "\n" + symbol
                + "\n" + symbol
                + "\n" + symbol + " " + symbol
                + "\n" + symbol
                + "\n" + symbol
                + "\n" + symbol + " " + symbol + " " + symbol + " " + symbol

        );
    }
}
