package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Input number ");

        a = sc.nextInt();

        if ((a%2)==0){
            System.out.println("Number is integer ");
        }
            else
                System.out.println("Number is double ");

    }
}
