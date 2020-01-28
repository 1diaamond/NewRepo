package com.al.work1;

public class Work1 {

    public static void main(String[] args) {
	    int a = 10;
	    int b = 100;
	    int c = 125;

	    int maxValue = a;
        if (maxValue < b) {
            maxValue=b;
        }
	    if (maxValue < c) {
	        maxValue = c;
        }
        System.out.println("Max --> " + maxValue);
    }
}
