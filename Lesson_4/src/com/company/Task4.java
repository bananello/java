package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int pos=0;
        int neg=0;
        System.out.println("Input three numbers ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a==0 | b==0 | c==0){
            pos=pos;
            neg=neg;
        }else
        if (a>0){
            pos++;
        }else
            neg++;
        if (b>0){
            pos++;
        }else
            neg++;
        if(c>0){
            pos++;
        }else
            neg++;
        System.out.println("Count of positive number " +pos);
        System.out.println("Count of negative number " +neg);
    }
}
