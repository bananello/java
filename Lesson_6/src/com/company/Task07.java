package com.company;

import java.util.Random;
import java.util.Scanner;

/*
7. Даны два массива A и B одинакового размера N. Сформировать новый массив C того же размера, каждый элемент которого равен максимальному из элементов массивов A и B с тем же индексом.
 */
public class Task07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  N;
        int i, j, c;

        System.out.println("Input length of array ");
        N = sc.nextInt();

        while (N<=0){
            System.out.println("Error, length should be >0 ");
            N = sc.nextInt();
        }

        int A [] = new int [N];
        int B [] = new int [N];
        int C [] = new int [N];

        System.out.println("First array ");
        for (i = 0; i<=A.length-1; i++){                //заполнение массива
            A[i] = new Random().nextInt(10);
            System.out.println(A[i]);
        }

        System.out.println("Second array ");
        for ( j = 0; j<=B.length-1; j++){                //заполнение массива
            B[j] = new Random().nextInt(10);
            System.out.println(B[j]);
        }

        for (i = 0, j = 0, c = 0; (i <= A.length-1 & j <= B.length-1 & c <= C.length-1) ; i++, j++, c++){
            if (A[i] < B[j]){
                C[c]=B[j];
            }else
                C[c]=A[i];
        }

        System.out.println("Final array ");
        for (c = 0; c <= C.length-1; c++){
            C[c]=C[c];
            System.out.println( +C[c]);
        }
    }

}
