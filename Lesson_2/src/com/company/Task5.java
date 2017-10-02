package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int A, B, C;

        System.out.println("Input number A ");
        A = sc.nextInt();
        System.out.println("Input number B ");
        B = sc.nextInt();
        System.out.println("Input number C ");
        C = sc.nextInt();

        if (A>0 ^ B>0 ^ C>0){
            System.out.println("One of the number is positive ");
        }
        else
            System.out.println("Two or more numbers is positive or all numbers are negative, or equal 0 ");

    }
}
