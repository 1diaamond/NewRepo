package work21;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите количество недель, что бы узнать сколько в них секунд!");
        Integer weeks = scanner.nextInt();
        Integer sec = 1;
        Integer min = sec*60;
        Integer hour = min*60;
        Integer day = hour*24;
        Integer result = weeks*day*7;
        System.out.println("В "+ weeks + " неделях " + result + " секунд");
    }
}
