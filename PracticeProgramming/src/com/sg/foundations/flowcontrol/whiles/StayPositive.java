package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args) {
        // Create integer to count down from
        int i;

        // Ask user for starting number
        System.out.println("What number do you want to count down from?");

        //Create Scanner
        Scanner input = new Scanner(System.in);
        i = input.nextInt();

        System.out.println("Counting down....");

        while (i > 0) {
            //Print the counter
            System.out.println(i);
            i--;
        }

        System.out.println("Blast off!");
    }
}
