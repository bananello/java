package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
8. Даны два массива A и B, элементы которых упорядочены по возрастанию. Объединить эти массивы так, чтобы результирующий массив C остался упорядоченным по возрастанию.
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int i, j, c;

        System.out.println("Input length of array ");
        N = sc.nextInt();

        while (N <= 0) {
            System.out.println("Error, length should be >0 ");
            N = sc.nextInt();
        }

        int A[] = new int[N];
        int B[] = new int[N];
        int C[] = new int[A.length + B.length];


        //System.out.println("First array ");
        for (i = 0; i <= A.length - 1; i++) {                //заполнение массива
            A[i] = new Random().nextInt(10);
            //System.out.println(A[i]);
        }
        Arrays.sort(A);
        System.out.println("Sort first array ");
        for (i = 0; i <= A.length - 1; i++) {
            System.out.println(A[i]);
        }
        /*System.out.println("Sort first array ");     //сортиовка массива
        for(i = A.length-1; i >= 0 ; i--){
            for(j = 0 ; j < i ; j++){

            if( A[j] > A[j+1] ){
                int tmp = A[j];
                A[j] = A[j+1];
                A[j+1] = tmp;
            }
        }
            System.out.println(A[i]);
    }*/
        //System.out.println("Second array ");
        for (j = 0; j <= B.length - 1; j++) {                //заполнение массива
            B[j] = new Random().nextInt(10);
            //System.out.println(B[j]);
        }

        Arrays.sort(B);
        System.out.println("Sort second array ");
        for (j = 0; j <= B.length - 1; j++) {
            System.out.println(B[j]);
        }

        //System.out.println("Array C: ");

        System.arraycopy(A, 0, C, 0, N);
        System.arraycopy(B, 0, C, N, N);
        for (c = 0; c <= C.length - 1; c++) {
            //System.out.println(C[c]);
        }
        Arrays.sort(C);

        System.out.println("Sort second array ");
        for (c = 0; c <= C.length - 1; c++) {
            System.out.println(C[c]);
        }

    }
}
