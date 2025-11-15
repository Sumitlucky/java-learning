package com.company;

import java.sql.SQLOutput;

public class SUMIT_CHAPTER_3_PRACTICE_SET {
    public static void main(String[] args) {
        //problem 1
        String name = "Sumit Komal";
        name = name.toLowerCase();
        System.out.println(name);


        //problem 2
        String name1 = "Sumit_komal_ji";
        System.out.println(name1.replace('_',';'));


        //problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        System.out.println(letter.replace("<|name|>","sumit"));

        //problem 4
        String mystring = "This string content   double and triple spaces";
        System.out.println(mystring.indexOf("   "));
        System.out.println(mystring.indexOf(" "));


        //problem 5
        String letter2 = "Dear Sumit ,\n\t This java cource is Nice.\n\t Thanks!";
        System.out.println(letter2);
    }
}
