package com.company;

import java.util.Scanner;

public class Geometric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, sqrt;

        System.out.println("Input the first positive value ");
        a = sc.nextDouble();

        while (a < 0) {
            System.out.println("Error! Number " + a + " is negative. Try to input the first number again.");
            a = sc.nextDouble();
        }

        System.out.println("Input the second positive value ");
        b = sc.nextDouble();

        while (b < 0){
            System.out.println ("Error! Number " + b + " is negative. Try to input the second number again.");
            b = sc.nextDouble();
        }

        c = a*b;
        System.out.println("Geometric avarage is equal " + Math.sqrt(c));

    }

}
