package com.company;

import java.util.Scanner;

/*
2. Создать метод проверяющий, что у переданного числа первая цифра равна последней
 */
public class Task02 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a;
        a = sc.nextInt();
        String m = NumberIsEqual(a);
        System.out.println(m);
    }

    public static String NumberIsEqual (int number){
        String s [] = new String [2];
        s[0] ="Первая и последняя цифры равны ";
        s[1] ="Первая и последняя цифры не равны ";
        int last;
        int first;
        last = number%10;

        while (number > 9){
            number = number/10;
        }
        first=number;

        if (first%last==0) return s[0];
        else return s[1];
    }

}
