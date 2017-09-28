package com.company;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        double a,b,c;

        System.out.println("Input the first number ");
        a = sc.nextDouble();
        System.out.println("Input the second number ");
        b = sc.nextDouble();

        c = (a+b)/2;

        System.out.println("Average is equal " + c);

    }
}
