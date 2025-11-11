package com.comapany;

import java.util.Scanner;
public class SUMIT_CHAPTER_2_PRACTICE_SET {
    public static void main() {
        //ques 1 -> what will the result of the following expression
        float  a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        //ques 2-> write a java program to encrypt a grade by adding 8 to it . Decrypt it to show the correct grade.
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decrypting the grade
        grade =(char)(grade - 8);
        System.out.println(grade);

        //ques 3 -> use comparison operators to find out whether a given number is greater than the users entered number or not
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b>8);

        //ques 4 -> write the following expression in a java program
        int c = (((v*v) - (u*u))/(2*a*s));
        System.out.println(c);

        // ques 5 -> find the value of the following expression
        int x = 7;
        int e = (7 * 49/7 + 35/7);
        System.out.println(e);
    }
}
