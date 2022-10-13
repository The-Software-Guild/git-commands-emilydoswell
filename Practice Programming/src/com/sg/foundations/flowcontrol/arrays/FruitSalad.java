package com.sg.foundations.basics.arrays;

public class FruitSalad {

    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad;

        // Code Recipe for fruit salad should go here!

        // Berries
        for (int i = 0; i < fruit.length; i++) {
            int counter = 0;
            if (fruit[i].contains("berry")) {
                System.out.println(fruit[i]);
                counter += 1;
            }
            // //  Add to fruit Salad array
            // for (i = 0; i < counter; i++) {
            //     fruitSalad[i] = fruit[i];
            // }
            //
            //
            // fruitSalad[i] = fruit[i];
        }

        // Print fruit salad array so far
        for (int i = 0; i < fruitSalad.length; i++) {
            // print the element
            System.out.println(fruitSalad[i]);
        }
    }
}

// Rules
// As many berries as possible
// No more than three kinds of apples
// No more than two kinds of orange
// Definitely no tomatoes
// No more than twelve kinds of fruit