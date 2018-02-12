package com.company;

import java.util.Scanner;

/*
3. Создать метод, вычисляющий факториал числа (n!= 1 * 2 * 3 * 4….* n)
 */
public class Task03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n; //объявляем факториал
        n = sc.nextInt();

        while  (n<0){
            System.out.println("Length should be >0 ");
            n = sc.nextInt();
        }
        int t = factorial(n);
        System.out.println(t);

    }

    public static int factorial (int fact){
        int res;
        if (fact == 0){
            res=1;
        }else if (fact == 1){
            res=1;
        }else {
            return factorial(fact - 1) * fact;
        }
        return res;
    }
}
