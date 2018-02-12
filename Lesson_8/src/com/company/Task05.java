package com.company;

import java.util.Scanner;

/*
 5. Создать метод вычисляющий количество дней в месяце определённого года (с учётом високосности года)
 */
public class Task05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year, month;
        System.out.println("Input year ");
        year = sc.nextInt();
        System.out.println("Input number of month ");
        month = sc.nextInt();
        System.out.println("Count of days is equal ");
        int result = CountOfDays(year, month);
        System.out.println(result);

    }

    public static int CountOfDays (int Year, int Month){
        int days=0;
        if(Year % 4 == 0){
            if (Month==1|Month==3|Month==5|Month==7|Month==8|Month==10|Month==12){
                days = 31;
            }if (Month==4|Month==6|Month==9|Month==11){
                days = 30;
            }if (Month==2){
                days = 29;
            }
        }
        if(Year % 4 != 0){
            if (Month==1|Month==3|Month==5|Month==7|Month==8|Month==10|Month==12){
                days = 31;
            }if (Month==4|Month==6|Month==9|Month==11){
                days = 30;
            }if (Month==2){
                days = 28;
            }
        }
        return days;
    }
}
