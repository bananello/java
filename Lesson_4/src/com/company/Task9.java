package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.println("Input number ");
        a = sc.nextInt();

        while ((a < 1) | (a > 5)) {
            System.out.println("Error! Number " + a + " is incorrect. Try to input the number again.");
            a = sc.nextInt();
        }

        if ((a == 1) | (a == 2)) {
            System.out.println("Unsatisfactory ");
        } else if (a == 3) {
            System.out.println("Satisfactory ");
        } else if (a == 4) {
            System.out.println("Good ");
        } else
            System.out.println("Perfect ");

    }
}

