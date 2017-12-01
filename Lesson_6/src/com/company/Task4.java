package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int i;

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

        System.out.println("Even element of mas is: ");
        for (i = 2; i<=mas.length-1; i=i+2){
            System.out.println(mas[i]);
        }

    }
}
