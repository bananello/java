package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N,i;
        int res=1;

        System.out.println("Input count of numbers N: ");
        N=sc.nextInt();

        for (i=1; i<=N; i++){
            res = res*i;
        }
        System.out.println("Factorial is " + res);
    }
}
