package com.company;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = 1000;
        double p;
        int k = 0;
        double res;

        System.out.println("Input %. 0 < & < 25 ");
        p = sc.nextInt();

        while ((p > 25) | (p <= 1)) {
            System.out.println("Error. Again ");
            p = sc.nextInt();
        }
        p = p / 100;
        System.out.println("P is " + p);
        while (s <= 1100) {
            s = s * p + s;
            k++;
        }

        System.out.println("Count of month " + k);
        System.out.println("Total sum " + s);
    }
}
