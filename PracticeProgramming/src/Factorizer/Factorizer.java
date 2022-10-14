package Factorizer;

import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args) {
        System.out.println("What number would you like to factor?");

        //Create Scanner
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        // Print out the factors of number
        System.out.print("Factors of " + userInput + " are: ");

        // loop runs from 1 to 60
        for (int i = 1; i <= userInput; ++i) {

            // if number is divided by i
            if (userInput % i == 0) {
                System.out.print(i + " ");
            }
        }

        // Print how many factors


    }
}
