package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A,B,C,D,E,F;

        System.out.println("Input A,B,C ");

        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();

        D=A/C;
        E=B/C;
        F=D*E;

        System.out.println("Count is " +F);






    }
}
