package com.company;

import java.util.Random;
import java.util.Scanner;

/*
5. Дан массив ненулевых целых чисел размера N. Проверить, чередуются ли в нем положительные и отрицательные числа.
Если чередуются, то вывести 0, если нет, то вывести порядковый номер первого элемента, нарушающего закономерность.
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int i;
        int q = 0;

        System.out.println("Input length of mas ");
        N = sc.nextInt();

        while (N <= 0) {
            System.out.println("Error, input again ");
            N = sc.nextInt();
        }

        int mas[] = new int[N];


        System.out.println("Array is: ");
        for (i = 0; i <= mas.length - 1; i++) {
            Random r = new Random();
            q = r.nextInt(101) - 50;
            //System.out.println("Rand " + q);

            mas[i] = q;
            System.out.println(mas[i]);
        }


        for (i = 0; i < mas.length - 1; i++) {
            int t = mas[i] * mas[i + 1];
            if (mas[i] * mas[i + 1] > 0) {
                System.out.println("Element " + mas[i + 1]);
                break;
            } else if(i == mas.length-2){
                System.out.println("0");
            }
        }

    }

}
