package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a,b;
        int c=0;


        System.out.println("Input numbers A and B ");
        a=sc.nextInt();
        b=sc.nextInt();
        while (a>b){
            System.out.println("Input numbers again. Should be A<B ");
            a=sc.nextInt();
            b=sc.nextInt();
        }
        c=b-a-1;
        System.out.println ("Numbers ");
        for (b=b-1; b>a; b--){
            System.out.println( +b);
        }

        System.out.println("Count of numbers " +c);


    }
}
