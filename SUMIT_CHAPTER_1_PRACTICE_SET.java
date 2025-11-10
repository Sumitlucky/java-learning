package com.company;

import java.util.Scanner;

public class SUMIT_CHAPTER_1_PRACTICE_SET {
    public static void main(String[] args) {
        // question - 1
       int a = 2;
       int b = 6;
       int c = 6;
       int d = a+b+c;
       System.out.println(d);
        // question - 2
       float subject1 = 50;
       float  subject2 = 80;
       float  subject3 = 89;
       float subject4 = 78;
       float  subject5 = 67;
       float  CGPA = (subject1+subject2+subject3+subject4+subject5)/50;
       System.out.println(CGPA);
        //question - 3
        System.out.println("What is your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day");
        //question - 5
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}

