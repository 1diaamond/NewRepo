package com.al.work2;

public class Work2 {
    public static void main(String[] args) {
        String name = "National Aviation University";
        String abrr = "" + name.charAt(0);
        abrr += name.charAt(name.indexOf(" ") + 1);
        abrr += name.charAt(name.lastIndexOf(" ") + 1);
        System.out.println(abrr);
    }
}
