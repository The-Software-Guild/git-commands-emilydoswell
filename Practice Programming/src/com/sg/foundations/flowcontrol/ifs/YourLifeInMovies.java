package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args) {
        // Write a program that displays a different message based on the year someone was born to make them feel old.
        System.out.println("What year were you born?");

        //Create Scanner
        Scanner input = new Scanner(System.in);
        int yearOfBirth = input.nextInt();

        // If they were born before 2005, print out that Pixar's 'Up' came out over a decade ago.
        if (yearOfBirth < 2005) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago ");
        }

        // If they were born before 1995, print out that the first Harry Potter came out over 15 years ago.
        if (yearOfBirth < 1995) {
            System.out.println("Did you know that the first Harry Potter came out over 15 years ago ");
        }

        // If they were born before 1985, print out Space Jam came out not last decade, but the one before THAT.
        if (yearOfBirth < 1985) {
            System.out.println("Did you know that Space Jam came out not last decade, but the one before THAT.");
        }

        // If they were born before 1975, print out that the original Jurassic Park release is closer to the first lunar landing than it is to today.
        if (yearOfBirth < 1975) {
            System.out.println("Did you know that the the original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }

        // If they were born before 1965, print out that the MASH TV series has been around for almost half a century!
        if (yearOfBirth < 1965) {
            System.out.println("Did you know that the MASH TV series has been around for almost half a century!");
        }
    }
}
