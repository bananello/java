package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int res = 0;

        a=sc.nextInt();

       while (a>0){
           res=res*10;
           res=res + a%10;
           a=a/10;
       }
   System.out.println("Re" +res);
    }
}
