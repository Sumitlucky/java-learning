package com.company;

import java.sql.SQLOutput;

public class SUMIT_CHAPTER_4_LOGICAL_OPERATOR {
    public static void main(String[] args) {
        System.out.println("for logical AND..");
        boolean a = true;
        boolean b = false;

        if ( a && b){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

        System.out.println("for logical OR...");

        if (a||b){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        System.out.println("for logical NOR...");
        System.out.print("Not(A) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
