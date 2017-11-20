package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N,i;
        System.out.println("Input number ");

        N = sc.nextInt();

        while (N < 4) {
            System.out.println("Input number again. Should be N>3 ");
            N = sc.nextInt();
        }
        for (i=N; ((i>1)&(i%3==0)); i = i/3){
        }
System.out.println(i==1);
    }
}
