package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
         {
            // write your code here
            String s,s1;
            char ch;
            int x;
            char [] mas;
            s = "hello";
            s1= "banan";
            String ss;

            s = s + ", " + s1 + "!"; //объединение строк
            ch = s.charAt(0); //второй символ
            x = s.length(); //длина
            mas = s.toCharArray();
            ss = s.replace('a', 'u');

            System.out.println(s);
            System.out.println(x);
            System.out.println(ch);
            System.out.println(s);
            System.out.println(ss);
        }
    }
}
