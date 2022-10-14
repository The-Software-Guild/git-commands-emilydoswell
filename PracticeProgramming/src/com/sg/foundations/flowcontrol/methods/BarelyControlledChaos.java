package com.sg.foundations.basics.methods;

import java.util.Random;
import java.util.Scanner;

public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = choseColour(); // call color method here
        String animal = choseAnimal(); // call animal method again here
        String colorAgain = choseColour(); // call color method again here
        int weight = choseNumber(5, 200); // call number method,
        // with a range between 5 - 200
        int distance = choseNumber(10, 20); // call number method,
        // with a range between 10 - 20
        int number = choseNumber(10000, 20000); // call number method,
        // with a range between 10000 - 20000
        int time = choseNumber(2, 6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    // Method 1 - Write a method that returns a randomly chosen color (have it choose from at LEAST five different colors!)
    public static String choseColour(){
        Random rng = new Random();

        String[] colours = new String[] { "Green", "Yellow", "Purple", "Orange", "White" };
        int randomIndex = rng.nextInt( colours.length );
        String randomColour = colours[randomIndex];
        return randomColour;
    }

    // Method 2 - Write a method that returns a randomly chosen animal (have it choose from at LEAST five different animals!)
    public static String choseAnimal(){
        Random rng = new Random();

        String[] animals = new String[] { "Tiger", "Bear", "Lion", "Dog", "Whale" };
        int randomIndex = rng.nextInt( animals.length );
        String randomAnimal = animals[randomIndex];
        return randomAnimal;
    }

    // // Method 2.5 - refactored methods 1 & 2
    // public static String choseSomething(String[] something){
    //     Random rng = new Random();
    //
    //     //Create Scanner
    //     Scanner input = new Scanner(System.in);
    //     String userInput = input.nextInt();
    //
    //     String[] animals = new String[] { "Tiger", "Bear", "Lion", "Dog", "Whale" };
    //     int randomIndex = rng.nextInt( animals.length );
    //     String randomAnimal = animals[randomIndex];
    //     return randomAnimal;
    // }

    // Method 3 - Write another method that returns a random integer chosen from a range (min/max) that can be either of the two numbers or anything between.
    public static int choseNumber(int a, int b){
        Random rng = new Random();

        int low = a;
        int high = b;
        int result = rng.nextInt(high-low) + low;

        return result;
    }
}