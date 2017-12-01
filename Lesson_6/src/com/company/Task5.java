package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int i;
        int res=0;

        System.out.println("Input length of mas ");
        N = sc.nextInt();

        while (N <= 0) {
            System.out.println("Error, input again ");
            N = sc.nextInt();
        }

        int mas[] = new int[N];

        System.out.println("Array is: ");
        for (i = 0; i < mas.length; i++) {
            mas[i] = new Random().nextInt();
            System.out.println(mas[i]);
        }
        for (i=0; i<mas.length-1; i++){
            if (mas[i]*mas[i+1]<0){
                System.out.println("Incorrect "+mas[i+1]);
            }

        }
        System.out.println("Correct " +0);
    }
}
