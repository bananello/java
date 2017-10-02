package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Input number ");

        a = sc.nextInt();

        if (((a>99) & (a<1000)) & ((a % 2) == 1)){
            System.out.println("True. Number is uneven and has 3 digit");
        }
        else
            System.out.println("False. Number is even/uneven or/and has not 3 digit");

    }


}
