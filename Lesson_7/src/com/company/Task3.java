package com.company;

import java.util.Scanner;

/*
3. Дан массив текстовых значений. Найти самый длинный элемент массива. Создать предложение из входящих в массив строк, самый длинный элемент массива разместить в начале предложения.
 */
public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string" );

       String s;
       s = new String();
       s=sc.nextLine();
        System.out.println(s); //вывод строки

        char [] ch = s.toCharArray();
        for (int k=0; k<=ch.length-1; k++){
            System.out.println(ch[k]); //вывод массива
        }

        String parts [] = s.split(" ");
        int w = parts.length;
        System.out.println();
        //System.out.println(w);  //разбивка строк (пробел)

        String ch1 = parts[0];
        for(int i=1;i<parts.length;i++){
            if(ch1.length()<parts[i].length())
                ch1 = parts[i];
        }
        System.out.println(ch1);//самый длинный элемент массива

        String parts1 [] = s.split(ch1);
        for (int k = parts1.length-1; k>=0; k--){
            System.out.println(ch1 + " " + parts1[k]);
        }


    }
}
