package com.company;

import java.util.Random;
import java.util.Scanner;
/*
4. Дан массив A размера N (N — четное число). Вывести его элементы с четными номерами в порядке возрастания номеров: A2, A4, A6, …, AN. Условный оператор не использовать.
 */
public class Task04 {
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

        for (i = 0; i<=mas.length-1; i++){                //заполнение массива
            mas[i] = new Random().nextInt(100);
            System.out.println(mas[i]);
        }

        System.out.println("Even position: ");

        for (i=2; i<=mas.length-1; i=i+2){
            System.out.println(mas[i]);
        }
    }
}

