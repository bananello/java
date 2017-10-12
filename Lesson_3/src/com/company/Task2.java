package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, e = 0, c, d;

        System.out.println("Input number a: 10<a<99 ");
        a = sc.nextInt();

        while (a <= 0 | a >= 100) {
            System.out.println("Wrong number, input a again ");
            a = sc.nextInt();
        }
            e = a / 10;
            c = a % 10;
            d = c * 10 + e;
        System.out.println("New number is " +d);


    }
}
