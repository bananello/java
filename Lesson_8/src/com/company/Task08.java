package com.company;

import java.util.Random;
import java.util.Scanner;

/*
8. Создать метод, возвращающий true, если заданное число находится "повсюду" в целочисленном массиве.
Под "повсюду" подразумевается, что при рассмотрении любой пары рядом стоящих элементов массива, одним из элементов будет искомое число, т.е.
	isEverywhere({1, 2, 1, 3}, 1) → true
	isEverywhere({1, 2, 1, 3}, 2) → false
	isEverywhere({1, 2, 1, 3, 4}, 1) → false
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Length of array ");
        int N = sc.nextInt();
        System.out.println("Input value ");
        int n = sc.nextInt();
        int[] inputData = PrepareData(N);
        System.out.println(MyMethod(n, inputData));
    }

    public static int[] PrepareData(int N) {
        int mas[] = new int[N];
        for (int i = 0; i <= mas.length - 1; i++) {                //заполнение массива
            mas[i] = new Random().nextInt(2);
            System.out.println(mas[i]);
        }
        return mas;
    }

    public static boolean MyMethod(int v2, int mas[]) {

        for (int i = 0; i < mas.length - 1; i++) {
            if ((mas[i] != v2) && (mas[i + 1] != v2)) return false;
        }
        return true;
    }
}

