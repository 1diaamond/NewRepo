package com.al.work4;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Work4 {
    /*public static void main(String[] args) {
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
    }*/
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        int index = myStr1.length();
        int i = 0;
        while (i < index){
            char letter = myStr1.charAt(i);
            if (myStr2.indexOf(letter) == -1) {
                System.out.print(letter);
            }
            i++;
        }
    }
}