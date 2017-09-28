package com.company;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r, l, s;
        double pi = 3.14;

        System.out.println ("Input the radius of circle ");
        r = scan.nextDouble();

        l = 2*pi*r;
        s = pi*r*r;

        System.out.println("circumference is equal " + l);
        System.out.println("square of circle is equal " + s);
    }
}
