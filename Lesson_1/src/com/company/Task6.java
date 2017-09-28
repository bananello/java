package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x1,y1,x2,y2,a,b,p,s;

        System.out.println("Input the first par coordinates (x1,y1) ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Input the first par coordinates (x2,y2) ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        a = Math.abs(x2-x1);
        b = Math.abs(y2-y1);
        p = 2*(a+b);
        s = a*b;

        System.out.println("Perimeter is equal " + p);
        System.out.println("Square is equal " + s);
    }
}
