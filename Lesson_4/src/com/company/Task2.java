package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Input some number ");
        a = sc.nextInt();
        if (a == 0) {
            a = a + 10;
            System.out.println("Number is 0, new number is  " + a);
        } else if (a > 0) {
            a = a + 1;
            System.out.println("Value is positive " + a);
        } else if (a < 0) {
            a = a - 2;
            System.out.println("Value is negative " + a);
        }
    }
}
