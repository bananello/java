package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1;
        int x2, y2; //Start Coordinate//
        int x3, y3;
        int x4, y4; //Possible or not//
        int a, b, c, d;
        //int x1=0,y1=0;
        //int x2=8,y2=8;

        System.out.println("Input initial coordinates from (0;0) to (8;8) ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("(" + x1 + ";" + y1 + ")");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("(" + x2 + ";" + y2 + ")");

        System.out.println("Possible or not? Input coordinates from (0;0) to (8;8) ");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.println("(" + x3 + ";" + y3 + ")");
        x4 = sc.nextInt();
        y4 = sc.nextInt();
        System.out.println("(" + x4 + ";" + y4 + ")");

        a = Math.abs(x3 - x1);//2
        b = Math.abs(y3 - y1);//2
        c = Math.abs(x4 - x2);//2
        d = Math.abs(y4 - y2);//2

        if (((x1 == x3) | (y1 == y3))&((x2 == x4) | (y2 == y4)) | ((a == b) & (c == d))) {
            System.out.println("Possible ");
        }
        else
        System.out.println("Impossible ");
    }
}
