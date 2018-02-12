package com.company;

import java.util.Scanner;

/*
4. Создать метод, подсчитывающий количество вхождения подстрок в строку
 */
/*public class Task04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        String s1;
        System.out.println("Input first string");
        s = sc.nextLine();
        System.out.println("Input substring");
        s1 = sc.nextLine();
        StringBuffer buffer = new StringBuffer(s);
        StringBuffer buffer1 = new StringBuffer(s1);
        int quantityOfMatches = SearchSubstring(buffer, s1);
        System.out.println(quantityOfMatches);
    }

    public static int SearchSubstring (StringBuffer firstString, String secondString){
        int count = 0;
        //StringBuffer s = (StringBuffer)firstString;
        while(firstString.length() > 0){
            if (firstString.indexOf(secondString) != -1){
                int o = firstString.indexOf(secondString);
                //System.out.println(o);
                if(o != 0){
                    firstString.delete(0, o);
                }else {
                    firstString.delete(0, secondString.length());
                }
                count ++;
            }else {
                break;
            }
        }
        if (count == 0){
            System.out.println("Doesn't contain");
        }else if (count > 0){
            System.out.println("Contain");
        }
       return count;
    }
}*/
public class Task04 {
    //4. Создать метод, подсчитывающий количество вхождения подстрок в строку

    public static void main(String[] args) {
        checkSubsringQauantity();
    }



    public static void checkSubsringQauantity() {

        System.out.println("Enter initial string");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println("Enter second string");
        String ss = scanner.nextLine();
        int count = 0;
        for (int i = 0; i <= s.length()-ss.length(); ) {
            String debug = s.substring(i,ss.length()+i);
            if (s.substring(i,ss.length()+i).equals(ss)){
                count++;
                i = i+ss.length();
            }
            else {
                i++;
            }
        }
        System.out.println(count);
    }
}
