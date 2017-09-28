package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, C, X;

        System.out.println("Input A,B,C,X ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        X = sc.nextInt();

        X = A;
        A = B;
        B = C;
        C = X;
        System.out.println ("A=" +A+ " B=" +B+ " C=" +C);
    }
}
