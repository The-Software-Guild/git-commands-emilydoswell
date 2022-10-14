package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        //Integer of my choice stored in a variable called number
        int number = 5;

        //Ask user to pick a number
        System.out.println("Pick a number and type it now:");

        //Create Scanner
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        //Print out user input
        System.out.println("You entered: " + userInput);

        //If their choice is equal to the number print out: "Wow, nice guess! That was it!"
        // If their choice is less to the number print out: "Ha, nice try - too low! I chose #."
        // If their choice is greater to the number print out: "Too bad, way too high. I chose #."
        if (userInput == number) {
            System.out.println("Wow, nice guess! That was it!");
        } else if (userInput < number) {
            System.out.println("Ha, nice try - too low! I chose: " + number);
        } else {
            System.out.println("Too bad, way too high. I chose: " + number);
        }
    }
}
