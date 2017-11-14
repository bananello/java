package com.company;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Input A,B ");
        a = sc.nextInt();
        b = sc.nextInt();

        a=a+b;
        b=b-a;
        b=-b;

        a=a-b;

        System.out.println("a=" +a+ "b=" +b);
       //System.out.println("A=" +B+ " B=" +C+ " C=" +A);

    }
}
