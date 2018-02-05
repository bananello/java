package com.company;

import java.util.Scanner;
/*
1. Дано целое число N (> 0). Сформировать и вывести целочисленный массив размера N, содержащий N первых положительных нечетных чисел: 1, 3, 5, … .
 */
public class Task01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
                int N;
                System.out.println("Input length of array ");
                N = sc.nextInt();

                while  (N<=0){
                    System.out.println("Length should be >0 ");
                    N = sc.nextInt();
                }

        int mas[] = new int[N];

                for (int i=0; i<N; i++){
                    mas [i] = i;
                    if (mas[i]%2==1){
                        System.out.println(mas[i]);
                    }
                }
    }
}
