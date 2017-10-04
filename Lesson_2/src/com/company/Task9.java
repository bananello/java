package com.company;

import java.util.Scanner;


public class Task9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1,y1;
        int x2,y2;
        //int x1=0,y1=0;
        //int x2=8,y2=8;
        //int x3,y3;
        //int x4,y4;
        System.out.println("Input coordinates from (0;0) to (8;8) ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println( "(" + x1 + ";" + y1 + ")" );
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println( "(" + x2 + ";" + y2 + ")" );

        if ((((x1+y1)%2)==1&(((x2+y2)%2)==1))){
            System.out.println("Field is white");
        }
            else
                System.out.println("Field is black");


    }
}
