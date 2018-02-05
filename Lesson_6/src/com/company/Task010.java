package com.company;

import java.util.Random;
import java.util.Scanner;
/*
10. Дан массив размера N. Обнулить элементы массива, расположенные между его минимальным и максимальным элементами (не включая минимальный и максимальный элементы).
 */
public class Task010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N;
        //int i;
        int indexOfmax = 0;
        int indexOfmin = 0;

        System.out.println("Input length of array ");
        N = sc.nextInt();

        while (N <= 0) {
            System.out.println("Error, length should be >0 ");
            N = sc.nextInt();
        }

        int mas[] = new int[N];

        System.out.println("Array is equal: ");
        for (int i = 0; i <= mas.length - 1; i++) {                //заполнение массива
            mas[i] = new Random().nextInt(100);
            System.out.println(mas[i]);
        }

        /*int min = 0;
        int max = 0;

        for (int i = mas.length-1; i >= 0; i--){
            if (mas[i]>mas[max]){
                max=i;
            }if (mas[i]<mas[min]){
                min=i;
            }
        }

        if (max<min){
            max+=min;
            min=max-min;
            max=max-min;
        }

        for (int i = min+1; i<min+(max-min); ++i){
            mas[i]=0;
        }

        System.out.println("res");
        for (int i = 0; i < mas.length; i++){
            System.out.println(i+1 + mas[i]);
        }*/

        for (int i = 1; i < mas.length; i++){
            if (mas[i] < mas[indexOfmin]){
                indexOfmin = i;
            } else if (mas[i] > mas[indexOfmax]){
                indexOfmax = i;
            }

        }
        System.out.println("Max " +indexOfmax + " Min " + indexOfmin);

        for (int i = 1; i < (indexOfmin-indexOfmax); i++) {
            if (indexOfmin + i < indexOfmax) {
                mas[indexOfmin + i] = 0;
            } else if (indexOfmax + i < indexOfmin) {
                mas[indexOfmax + i] = 0;
            }
        }
            for (int i = 0; i < mas.length; i++){
                System.out.println(i+1 + mas[i]);
            }
        }

    }

