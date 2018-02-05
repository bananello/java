package com.company;

import java.util.Random;
import java.util.Scanner;
/*
2. Дан массив размера N. Вывести его элементы в обратном порядке.
 */
public class Task02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Input length of array ");
        N = sc.nextInt();

        while (N<=0){
            System.out.println("Error, length should be >0 ");
            N = sc.nextInt();
        }

        int mas [] = new int [N];
        int i;

        System.out.println("Array is equal: ");

        for (i = 0; i<=mas.length-1; i++){
            mas[i] = new Random().nextInt(100);
            System.out.println(mas[i]);
        }

        System.out.print("Revers:  ");

        for (i = mas.length-1; i >= 0; i--){
            System.out.println(mas[i]);
        }
    }

}
