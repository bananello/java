package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        //int mas[];

        System.out.println("Input length of mas ");

        N = sc.nextInt();
        while (N < 0) {
            System.out.println("Error length should be positive ");
            N = sc.nextInt();
        }
        int mas[] = new int[N];




        for (int i = 0; i < N; i++) {
            mas[i] = i;
            if ((mas[i])%2==1){
                System.out.println(mas[i]);
            }
        }

    }
}
