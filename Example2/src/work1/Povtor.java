package work1;

import java.util.Scanner;

public class Povtor {
    public static void main(String[] args) {
        System.out.println("Enter the number of the weeks -> ");
        Scanner sc = new Scanner(System.in);
        int weeks = sc.nextInt();
        System.out.println(weeks*7*24*60*60);

    }
}
