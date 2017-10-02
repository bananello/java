package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, C;

        System.out.println("Input number A ");
        A = sc.nextInt();
        System.out.println("Input number B ");
        B = sc.nextInt();
        System.out.println("Input number C ");
        C = sc.nextInt();

        if (A > 0 | B > 0 | C > 0){
            System.out.println("Some number is positive ");
        }
            else
                System.out.println("All number is negative or 0 ");
    }
}
