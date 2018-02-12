package com.company;

import java.util.Scanner;

/*
7. Создать метод сравнивающий (лексиграфически) две строки
 */
public class Task07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        String s1;
        System.out.println("Input first string ");
        s = sc.nextLine();
        System.out.println("Input second string ");
        s1 = sc.nextLine();

        String m = CompareStrings(s, s1);
        System.out.println(m);
    }

    public static String CompareStrings (String string, String string1) {
        char[] array = string.toCharArray();
        char[] array1 = string1.toCharArray();

        String str[] = new String[2];
        str[0] = "Cool";
        str[1] = "Not cool ";
        int i, j;
        if (array.length == array1.length) {
            for (i = 0, j = 0; i < array.length & j < array1.length; i++, j++) {
                if (array[i] == array1[j]) {
                    i++;
                    j++;
                }else break;
                return str[0];
            }
                if (array[i] != array1[j]) return str[1];
        }
        return str[1];
    }
}
