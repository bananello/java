package com.company;

import java.util.Scanner;

public class Module {
    public static void main(String[] args) {

        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first value ");
        a = sc.nextInt();
        //System.out.println("Module of the first value is equal " + Math.abs(a));

        System.out.println("Input the second value ");
        b = sc.nextInt();
        //System.out.println("Module of the second value is equal " + Math.abs(b));

        c = Math.abs(a-b);
        System.out.println("Length is equal " + Math.abs(c));
    }

}
