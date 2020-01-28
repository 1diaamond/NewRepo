package work2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summa = 230205;
        int m = 6;
        double pr = 12.0;
        double prof = summa * (pr / 100.0) /12 * m;
        System.out.println(prof);
    }
}
