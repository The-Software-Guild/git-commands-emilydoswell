import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // The program first asks the user how many dollars they have to bet.
        System.out.println("How many dollars do you have?");

        //Create Scanner
        Scanner input = new Scanner(System.in);
        int dollars = input.nextInt();


        // set counter
        int counter = 0;

        while (dollars > 0) {
            // Generate number between 1 and 6.
            Random rng = new Random();
            int diceOne = rng.nextInt(6) + 1;
            int diceTwo = rng.nextInt(6) + 1;
            int total = diceOne + diceTwo;

            if (total == 7) {
                dollars += 4;
            } else {
                dollars -= 1;
            }
            counter += 1;
        }

        if (dollars <= 0) {
            System.out.println("You broke after " + counter + " turns");
        }
    }
}

// The program then rolls the dice repeatedly until all the money is gone.
// Hint: Use a loop construct to keep playing until the money is gone.
// The program keeps track of how many rolls were taken before the money ran out.
// The program keeps track of the maximum amount of money held by the player.
// The program keeps track of how many rolls were taken at the point when the user held the most money.
// Hint: For steps 4, 5, and 6, declare some variables.