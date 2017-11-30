package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int i;
        int c=0;
        int k=0;

        System.out.println("Input length of mas ");
        N = sc.nextInt();

        while (N <= 0) {
            System.out.println("Error, input again ");
            N = sc.nextInt();
        }

        int mas[] = new int[N];

        System.out.println("Array is: ");
        for (i = 0; i < mas.length; i++) {
            mas[i] = new Random().nextInt(100);
            System.out.println(mas[i]);
        }

        System.out.println("Even element of mas: ");
        for (i = 0; i < N; i++) {
            if (i % 2 == 0) {
                System.out.println(mas[i]);
                k++;
            }
        }
        System.out.println("Not even element of mas: ");
        for (i = mas.length - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                System.out.println(mas[i]);
                c++;
            }
        }
        System.out.println("Count of even " +k);
        System.out.println("Count of not even " +c);
    }
}

