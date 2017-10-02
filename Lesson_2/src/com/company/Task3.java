package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, C;

        System.out.println("Input number A ");
        A = sc.nextInt();
        System.out.println("Input number B ");
        B = sc.nextInt();
        System.out.println("Input number C ");
        C = sc.nextInt();

        if (A < B & B < C) {
            System.out.println("Expression A < B < C is true ");
        } else
            System.out.println("Expression is fail ");
    }
}
