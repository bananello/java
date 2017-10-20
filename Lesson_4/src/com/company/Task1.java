package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Input some number ");
        a = sc.nextInt();
        if (a == 0) {
            System.out.println("Number is 0, please input other number ");
        } else if (a > 0) {
            a = a + 1;
            System.out.println("Value is positive " + a);
        } else
            System.out.println("Value is negative " + a);
    }
}
