package com.company;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Input a,b,c ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a < b + c) & (b < a + c) & (c < a + b)) {
            System.out.println("Triangle is exists");
        } else
            System.out.println("Triangle is not exists");


    }
}
