package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        a=sc.nextInt();
        b=sc.nextInt();

        while (a<=b) {
            System.out.println("Error. Try again ");
            a = sc.nextInt();
            b = sc.nextInt();
        }
        c=a;
        while(c>=0){
            c=c-b;
        }
        System.out.println( +c+b);
    }

}
