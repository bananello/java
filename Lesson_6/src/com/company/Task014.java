package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
14. Создайте двумерный массив NxM. Заполните его случайными целыми числами от 0 до 9. Выведите массив на экран.
 Отсортируйте каждую строку массива, по возрастанию. Выведите преобразованный массив на экран.
 */
public class Task014 {
    public static void main(String[] args) {
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


        int[][] mas = new int[N][M];

        System.out.println("Array is equal: ");

        for (i = 0; i <= N - 1; i++) {
            System.out.println();
            for (j = 0; j <= M - 1; j++) {
                mas[i][j] = new Random().nextInt(9);
                System.out.print(mas[i][j] + " ");
            }
        }
        //System.out.println("Res ");
        for (i = 0; i <= N - 1; i++) {
            for (int k = 0; k <= M - 1; k++)
                for (j = 0; j < M - 1; j++) {
                    if (mas[i][j] > mas[i][j + 1]) {
                        int tmp = mas[i][j];
                        mas[i][j] = mas[i][j + 1];
                        mas[i][j + 1] = tmp;
                    }
                }
        }
        System.out.println();
        for (i = 0; i <= N - 1; i++) {
            System.out.println();
            for (j = 0; j <= M - 1; j++) {
                System.out.print(mas[i][j] + " ");
            }
        }

    }

}
