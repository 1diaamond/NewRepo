package work3;

public class Main {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 7;
        var1 = var1 + var2; // 12
        var2 = var1 - var2; // 5
        var1 = var1 - var2; // 7
        System.out.println( "var1 =" + var1 );
        System.out.println( "var2 =" + var2 );
    }
}
