package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b,c;
    int count=0;
    System.out.println("Input three numbers ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a>0){
            count=count+1;
        }else
            count=count;
        if (b>0){
            count=count+1;
        }else
            count=count;
        if(c>0){
            count=count+1;
        }else
            count=count;
        System.out.println("Count of positive number " +count);
    }
}
