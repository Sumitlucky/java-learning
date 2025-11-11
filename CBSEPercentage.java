package com.company;
import java.util.Scanner;

public class CBSEPercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Math Marks: ");
        float math = sc.nextFloat();

        System.out.print("Science Marks: ");
        float science = sc.nextFloat();

        System.out.print("English Marks: ");
        float english = sc.nextFloat();

        System.out.print("Hindi Marks: ");
        float hindi = sc.nextFloat();

        System.out.print("Social Science Marks: ");
        float sst = sc.nextFloat();

        float total = math + science + english + hindi + sst;
        float percentage = (total / 500) * 100;

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
    }
}
