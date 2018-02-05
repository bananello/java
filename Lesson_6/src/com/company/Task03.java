package com.company;

import java.util.Random;
import java.util.Scanner;
/*
3. Дан целочисленный массив размера N. Вывести вначале все содержащиеся в данном массиве четные числа в порядке возрастания их индексов,
а затем — все нечетные числа в порядке убывания их индексов. Также вывести количество четных и нечетных членов массива.
 */
public class Task03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        int k = 0;
        int j = 0;
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

        System.out.println("Even: ");

        for(i = 0; i<=mas.length-1; i++)
            if (mas[i]%2==0){
                System.out.println(mas[i]);
                k++;
        }

        System.out.println("Not even : ");

        for(i = 0; i<=mas.length-1; i++)
            if (mas[i]%2==1){
                System.out.println(mas[i]);
                j++;
            }
        System.out.println("Count of even: " +k);
        System.out.println("Count of not even: " +j);

    }
}
