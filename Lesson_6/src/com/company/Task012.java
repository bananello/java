package com.company;

import java.util.Random;
import java.util.Scanner;

/*
12. Создайте массив из случайного числа элементов, заполненный случайными числами. Под "диапазоном" понимаются все числа, находящиеся между двумя одинаковыми числами(включительно).
 Единственное число имеет диапазон 1. Найдите наибольший диапазон в массиве.
[6] = 1
[4][0][9][1][7][8][9][0]  = 7
[8][8][7][2][0][2][1][9]  = 3
[0][7][3][5][1][7][0]  = 7
 */
public class Task012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        int i;
        System.out.println("Input length of array ");
        N = sc.nextInt();

        while (N <= 0) {
            System.out.println("Error, length should be >0 ");
            N = sc.nextInt();
        }

        int mas[] = new int[N];


        System.out.println("Array is equal: ");

        for (i = 0; i <= mas.length - 1; i++) {                //заполнение массива
            mas[i] = new Random().nextInt(100);
            System.out.println(mas[i]);
        }
    }
}
