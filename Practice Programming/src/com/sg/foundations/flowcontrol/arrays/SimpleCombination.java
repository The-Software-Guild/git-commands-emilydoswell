package com.sg.foundations.basics.arrays;

public class SimpleCombination {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!

        int[] wholeNumbers = new int[24];

        // Combining code should go here!
        for (int i = 0; i < firstHalf.length; i++)
        {
            // copy the element at the current index
            // from firstHalf to wholeNumbers
            wholeNumbers[i] = firstHalf[i];
        }

        for (int i = 0; i < secondHalf.length; i++)
        {
            // copy the element at the current index
            // from firstHalf to wholeNumbers
            wholeNumbers[firstHalf.length + i] = secondHalf[i];
        }

        // Printing code should go here
        for (int i = 0; i < wholeNumbers.length; i++) {

            // print the element
            System.out.println(wholeNumbers[i]);
        }
    }
}