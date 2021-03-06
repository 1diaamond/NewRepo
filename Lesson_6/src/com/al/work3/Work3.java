package com.al.work3;

public class Work3 {
    public static void main(String[] args) {
        String text = "  dsgsd ";
        char symbol = getFirstCharacterOfWord(text,1);
        if (symbol != '\u0000') {
            System.out.println("char   ->  " + symbol);
        } else {
            System.out.println("word not found");
        }
    }
    public static char getFirstCharacterOfWord(String str, int numberWord) {

        str.trim();
        if (str.length() ==0 ){
                return '\u0000';
        } else if (numberWord ==1 ) {
            return str.charAt(0);
        } else {
            int counterWord = 1;
            int position = 0;
            while ((position = str.indexOf(" ", position + 1)) != -1){
                counterWord++;
                if (counterWord == numberWord){
                    return str.charAt(position + 1);
                }
            }
        }
        return '\u0000';
    }
}
