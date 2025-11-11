package com.company;

public class SUMIT_RESULTING_DATA_TYPES {
    public static void main(String[] args) {

        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 3.5f;
        double d = 6.8;
        char c = 'A';

        int r1 = b + s;     // byte + short = int
        int r2 = s + i;     // short + int = int
        float r3 = i + f;   // int + float = float
        float r4 = i + f + i; // float

        int r5 = c + i;     // char + int = int
        long r6 = i + l;    // int + long = long
        double r7 = l + d;  // long + double = double
        double r8 = f + d;  // float + double = double

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r7);
    }
}
