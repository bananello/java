package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b = 0, c, d, e, f;

        System.out.println("Input number a: 99<a<1000 ");
        a = sc.nextInt();

        while (a <= 99 | a >= 1000) {
            System.out.println("Wrong number, input a again ");
            a = sc.nextInt();
        }

        b = a / 10;
        c = a % 10;
        d = b / 10;
        e = b % 10;
        System.out.println("New number is " + c + +e + +d);


    }
}
