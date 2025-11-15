package com.company;

import java.util.Scanner;

public class SUMIT_CHAPTER_3_STRING_METHOD {
    public static void main(String[] args) {
        String name = "sumit";
        System.out.println(name );
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.substring(3));
        System.out.println(name.substring(2,4));
        System.out.println(name.replace('s','k'));
        System.out.println(name.startsWith("k"));
        System.out.println(name.endsWith("it"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("it"));
        System.out.println(name.indexOf("it",3));
        System.out.println(name.lastIndexOf("t"));
    }
}
