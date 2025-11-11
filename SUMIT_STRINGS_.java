package com.company;

import java.util.Scanner;

public class SUMIT_STRINGS_ {
    public static void main(String[] args) {
        //type 1 to write the string
        String name = new String("sumit singh romeo");
        System.out.println(name);

        //type 2 to write the string
        String name1 = "sumit kumar singh";
        System.out.println(name1);

        //type 3 to write the string
        int a = 6;
        float b = 5.67f;
        System.out.printf("The value of a is %d and value of b is %f " , a , b);
        //this is for next line to print another line print the string |
        System.out.println();

        System.out.format("The value of a is %d and value of b is %f " , a , b);
        //type 4 to write the string |
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
    }
}
