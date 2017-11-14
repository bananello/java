package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("Input number from 1 to 999 ");
        a=sc.nextInt();

        while ((a < 1)|(a>999)) {
            System.out.println("Error! Number " + a + " is incorrect. Try to input the number again.");
            a = sc.nextInt();
        }

            if (a%2==0){
                System.out.println("Number is even ");
            }else
                System.out.println("Number is not even ");

            if((a>0)|(a<10)){
                System.out.println("Number is single ");
            }else
                if((a>9)|(a<100)){
                System.out.println("Number is double ");
                }else
                    System.out.println("Number is three");
        }
    }

