package com.company;

import java.util.Random;
import java.util.Scanner;

/*
13. Создать двумерный массив NxM. Заполнить его случайными целыми числами от -100 до 100. Вывести массив на экран. Вывести на экран значение максимального элемента этого массива
 */
public class Task013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        int M;
        int i;
        int j;
        System.out.println("Input length array [][] ");
        N = sc.nextInt();

        while (N <= 0) {
            System.out.println("Error, length should be >0 ");
            N = sc.nextInt();
        }

        M = sc.nextInt();

        while (M <= 0) {
            System.out.println("Error, length should be >0 ");
            M = sc.nextInt();
        }


        int [][] mas = new int[N][M];

        System.out.println("Array is equal: ");

        for (i = 0; i <= N - 1; i++) {
            for (j = 0; j <=M-1; j++){
                mas[i][j] = new Random().nextInt(100);
                System.out.println(mas[i][j]);
            }
        }

        int max = mas[0][0];
        int min = mas [0][0];

        for(i = 0; i < mas.length; i++) {
            for (j = 0; j <=M-1; j++) {
                if (mas[i][j] > max)
                    max = mas[i][j];

                if (mas[i][j] < min)
                    min = mas[i][j];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }

}
