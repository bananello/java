package com.company;

/*
1. Создать метод вывода на консоль погодных условий. В метод передаётся температура (в градусах Цельсия) и скорость ветра.
На консоль выдаётся строки типа: «Холодно, небольшой ветер», «Тепло, безветренно» и т.п.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt(); // temperature
        b = sc.nextInt(); // speed
        String m = myFunction(a, b);
        System.out.println(m);
    }

    public static String myFunction(int temperature, int speed) {
        String s [] = new String [4];
        s[0] = "Холодно и ветряно ";
        s[1] = "Холодно и безветряно ";
        s[2] = "Тепло и ветряно ";
        s[3] = "Тепло и безветряно ";

        if(temperature<0 & speed>5) return s[0];
        if(temperature<0 & speed<5) return s[1];
        if(temperature>0 & speed>5) return s[2];
        if(temperature>0 & speed<5) return s[3];
        return null;
    }
}
