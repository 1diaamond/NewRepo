package com.al.work1;


public class Work1 {

    public static void main(String[] args) {
        Double f = areaTriangle(3,4,5);
        System.out.println("area 1 = " + f);
        System.out.println("area2 = " + String.format("%.2f", areaTriangle(6,5,9)));
    }
    public static double areaTriangle (double a, double b, double c) {
        double p = (a + b +c) /2 ;
        double area = Math.sqrt (p * (p - a) * (p -b) * (p-c));
        return area;
    }

}
