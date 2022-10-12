package com.sg.foundations.flowcontrol.whiles;

public class StayPositive {
    public static void main(String[] args) {
        // Create integer to count down from
        int i = 10;

        System.out.println("Counting down....");

        while (i > 0) {
            //Print the counter
            System.out.println(i);
            i--;
        }

        System.out.println("Blast off!");
    }
}
