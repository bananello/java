package com.company;

import java.util.Scanner;
import java.util.Random;

/*
 Путешественник проходит каждый день несколько километров. Создать метод, выводящий на экран его путь с начала путешествия
 (в виде "День №1 : 10км; День №2 : 7км; День №3 : 13км; "). Метод должен работать для любого количества дней путешествия.
 */
public class Task06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int days;
        //int km=0;
        System.out.println("Input count of days ");
        days = sc.nextInt();

        String[] result = Travel(days);
        System.out.println(result);
    }

    public static String[] Travel (int day){


        int mas[] = new int[day];
        //int array [] = new int [kilometers];
        int i=0;
        int j=0;
        for(i = 0, j = 0; i<=mas.length-1 & j<=mas.length-1; i++){
           /* for (int j = 0; j<=array.length-1; j++){
                array[j]= new Random().nextInt(10);
                System.out.println(array[j]);
            }*/
            mas[j] = new Random().nextInt(20);
            mas[i]=i+1;

            System.out.println(mas[i] + " day - " + mas[j] + " km");
        }
        return null;
    }
}





/*
 while (N <= 0) {
            System.out.println("Error, length should be >0 ");
            N = sc.nextInt();
        }

 int mas[] = new int[N];



for (i = 0; i <= mas.length - 1; i++) {                //заполнение массива
            mas[i] = new Random().nextInt(100);
            System.out.println(mas[i]);
        }
 */