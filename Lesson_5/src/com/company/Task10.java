package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int i=2;

        System.out.println("Input N ");
        n=sc.nextInt();

        while ((i<n-1)&(n%i)!=0){
            i++;
        }
        System.out.println(+(n%i)!=0);
    }
}
