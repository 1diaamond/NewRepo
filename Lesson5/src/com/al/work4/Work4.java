package com.al.work4;


public class Work4 {
    public static void main(String[] args) {
        String str1 = "Cartoon";
        String str2 = "Tomcat";
        int size = str1.length();
        int index = 0;
        while (index < size){
            char symbol = str1.charAt(index);
            if (str2.indexOf(symbol) == -1) {
                System.out.print(symbol + " ");
            }
            index++;
        }
    }
}
