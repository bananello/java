package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Input length of mas ");
        N = sc.nextInt();

        while (N < 0) {
            System.out.println("Error length should be positive ");
            N = sc.nextInt();
        }
        int mas[] = new int[N];

        for (int i = mas.length-1; i >= 0; i--){
            mas[i] = i;
            System.out.println(+mas[i]);
        }
    }
}
