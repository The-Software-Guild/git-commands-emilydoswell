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

        int counter = 0;
        int sum = 0;

        // loop runs from 1 to 60
        for (int i = 1; i <= userInput; ++i) {

            // if number is divided by i
            if (userInput % i == 0) {
                System.out.print(i + " ");
                counter += 1;
                sum += i;
            }
        }

        // Print how many factors
        System.out.println("\n" + userInput + " has " + counter + " factors.");

        // Perfect number
        if (sum == (userInput * 2)) {
            System.out.println(userInput + " is a perfect number.");
        } else {
            System.out.println(userInput + " is not a perfect number");
        }

        System.out.println(counter);

        // Prime number
        if ((userInput <= 1) || counter > 2) {
            System.out.println(userInput + " is not a prime number.");
        } else {
            System.out.println(userInput + " is a prime number.");
        }
    }
}
