package com.company;
/*
С клавиатуры задается строка. Определить длину строки в символах и в словах (разделителем между словами считать знак пробела).
 Вывести заданную строку в обратном порядке по символам и по словам.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string" );
        String s = new String();
        s = sc.nextLine();
        System.out.println(s);

        int l = s.length(); //длинна в символах
        System.out.println(l);


        String parts [] = s.split(" "); //длина в словах
        int w = parts.length;
        System.out.println(w);


        StringBuffer ss = new StringBuffer(s); //строка в обратном порядке по символам
        ss.reverse();
        System.out.println(ss);

        for (int k = parts.length-1; k>=0; k--){ //
            System.out.println(parts[k]);
        }






    }
}
