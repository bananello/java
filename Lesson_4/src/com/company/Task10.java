package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        int c = 0;

        System.out.println("Select length unit \n 1-decimeter \n 2-kilometer \n 3-meter \n 4-millimeter \n 5-centimeter");
        a = sc.nextInt();
        System.out.println("Input length ");
        b = sc.nextInt();

        while ((b < 0)) {
            System.out.println("Error! Number " + b + " is incorrect. Try to input the number again.");
            b = sc.nextInt();
        }
        if (a == 1) {
            c = b / 10;
            System.out.println("You select decimeter. Length in meter is equal " + c);
        } else if (a == 2) {
            c = b * 1000;
            System.out.println("You select kilometer. Length in meter is equal " + c);
        } else if (a == 3) {
            c = b;
            System.out.println("You select meter. Length in meter is equal " + c);
        } else if (a == 4) {
            c = b / 1000;
            System.out.println("You select millimeter. Length in meter is equal " + c);
        } else if (a == 5) {
            c = b / 100;
            System.out.println("You select centimeter. Length in meter is equal " + c);
        }
    }
}
