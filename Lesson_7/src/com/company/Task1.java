package com.company;

import java.util.Scanner;

/*
1. С клавиатуры задается строка. Заменить в заданной строке все пробелы знаками подчеркивания.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string" );
    String s = new String();
    s=sc.nextLine();
        System.out.println(s);

        String ss = new String();
        ss = s.replace(' ', '_');
        System.out.println(ss);

    }
}
