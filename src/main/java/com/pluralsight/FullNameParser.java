package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome To The Full Name Parser! Let's Get To Parsing!");
        System.out.println("Please enter name as 'first last' or 'first middle last'.");

        System.out.print("Name: ");
        String name = scanner.nextLine().trim();

        String[] names = name.split(Pattern.quote( " "));
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);



    }
}
