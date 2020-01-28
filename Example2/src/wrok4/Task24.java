package wrok4;

public class Task24 {
    public static void main(String[] args) {
        int number = 123;
        int y = number;
        int x = y % 10 * 100; //
        y /=10;
        x += y % 10 * 10;
        y /=10;
        x += y;
        System.out.println(number - x);
    }
}
