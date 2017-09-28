package com.company;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, s, p;

        System.out.println ("Input the first side of rectangle ");
        a = scan.nextInt();
        System.out.println ("Input the second side of rectangle ");
        b = scan.nextInt();

        s = a * b;
        p = (a + b) * 2;

        System.out.println("square is equal " + s);
        System.out.println("perimeter is equal " + p);
    }
}
