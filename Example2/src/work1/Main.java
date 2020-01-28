package work1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of weeks");
        int weeks = sc.nextInt();
        int sec = weeks * 7 *24 * 60 * 60;
        System.out.println(sec);
    }
}
