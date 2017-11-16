package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A,B;
        int i,j;
        A=sc.nextInt();
        B=sc.nextInt();
        while (A>=B) {
            System.out.println("Input numbers again. Should be A<B ");
            A = sc.nextInt();
            B = sc.nextInt();
        }
            for (i=1; i<=B-A+1; i++){
            for(j=1; j<=i; j++)
                System.out.println( +A+i-1);
            }
        }
    }

