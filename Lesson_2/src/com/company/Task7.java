package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, x1, y1, x2, y2;

        System.out.println("Input the first par coordinates (x1,y1) ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Input the first par coordinates (x2,y2) ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("Input the first par coordinates (x,y) ");
        x = sc.nextInt();
        y = sc.nextInt();

        if (((x > x1) & (x < x2)) & ((y > y2) & (y < y1))) {
            System.out.println("Dot inside ");
        } else
            System.out.println("Dot outside ");

    }
}
