package com.company;

import java.util.Random;
import java.util.Scanner;

/*
6. Дан целочисленный массив размера N. Найти количество различных элементов в данном массиве.
 */
public class Task06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        //int i;
        int count = 0;
        int result = 0;


        System.out.println("Input length of array ");
        N = sc.nextInt();

        while (N<=0){
            System.out.println("Error, length should be >0 ");
            N = sc.nextInt();
        }

        int mas [] = new int [N];


        System.out.println("Array is equal: ");

        for (int i = 0; i<=mas.length-1; i++){                //заполнение массива
            mas[i] = new Random().nextInt(10);
            System.out.println(mas[i]);
        }


        int i2,num=1;
        for (int i=1; i<mas.length-1;++i,++num){
            for (i2=i-1; i2>=0;--i2){
                if (mas[i]==mas[i2]) {
                    --num;
                    break;
                }
            }
        }
        System.out.println("Count of different value is: " +num);

    }
}
