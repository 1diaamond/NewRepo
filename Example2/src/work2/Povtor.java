package work2;

public class Povtor {
    public static void main(String[] args) {
        long ms = System.currentTimeMillis();
        System.out.println(ms);
        long ss = ms / 1000;
        long min = ss % 60;
        long hours = min % 24;
        System.out.println(ss + ":" + min);

    }
}
