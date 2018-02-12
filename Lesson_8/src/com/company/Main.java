package com.company;

import java.util.Scanner;

/*
1. Создать метод вывода на консоль погодных условий. В метод передаётся температура (в градусах Цельсия) и скорость ветра.
На консоль выдаётся строки типа: «Холодно, небольшой ветер», «Тепло, безветренно» и т.п.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner (System.in);
        int number;
        number = sc.nextInt();

        while (number > 9){
            number = number/10;
        }
        System.out.println(number);
    }
}
