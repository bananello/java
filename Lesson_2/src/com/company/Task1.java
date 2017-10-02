package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Input number ");

        a = sc.nextInt();

        if (a < 0) {
            System.out.println("Number is negative ");
        }
        if (a > 0) {
            System.out.println("Number is positive ");
        }
        if (a == 0) {
            System.out.println("Number is 0 ");
        }

    }
}
