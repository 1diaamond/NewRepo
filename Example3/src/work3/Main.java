package work3;

public class Main {
    public static void main(String[] args) {
        int ccc = 1000;
        double perc = 10.0;
        double perc2 = 7.0;
        double cost = ccc - ccc * (perc/100.0);
        cost += cost * (perc2/100.0);
        System.out.println(cost);
    }
}
