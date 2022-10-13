import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
        public static void main(String[] args) {
            // The program first asks the user how many rounds he/she wants to play.
            System.out.println("Hello! Welcome to Rock, Paper, Scissors!");
            System.out.println("How many rounds would you like to play, between 1 and 10?");

            // Create Scanner
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();

            // Max rounds = 10, min rounds = 1.
            // If the user asks for something outside this range, the program prints an error message and quits.
            if (userInput > 10 || userInput < 1) {
                System.out.println("Sorry! That isn't in our range");
            }

            // If the number of rounds is in range, the program plays that number of rounds.
            System.out.println("Okay, we will play " + userInput + " rounds");
            System.out.println("type 1 for 'rock', 2 for 'paper' or 3 for 'scissors' when you're ready, go!");
            userInput = input.nextInt();

            // Generate number between 1 and 3.
            Random rng = new Random();
            int randomNumber = rng.nextInt(3) + 1;

            // Sequence
            if (userInput == randomNumber) {
                System.out.println("It's a draw!");
            } else if ((userInput == 1 && randomNumber == 2) || (userInput == 3 && randomNumber == 1) || (userInput == 2 && randomNumber == 3) ) {
                System.out.println("I win!");
            } else if ((userInput == 2 && randomNumber == 1) || (userInput == 1 && randomNumber == 3) || (userInput == 3 && randomNumber == 2) ) {
                System.out.println("You win!");
            } else {
                System.out.println("I'm sorry I don't recognise that number");
            }
        }

}

// The computer asks the user for his/her choice (Rock, Paper, or Scissors).
// Hint: 1 = Rock, 2 = Paper, 3 = Scissors
// After the computer asks for the user’s input, the computer randomly chooses Rock, Paper, or Scissors and displays the result of the round (tie, user win, or computer win).
// Hint: use the Random class.
// The program must keep track of how many rounds are ties, user wins, or computer wins.
// Hint: Create three variables to keep track of these items and update them correctly after each round.
// The program must print out the number of ties, user wins, and computer wins and declare the overall winner based on who won more rounds.
// After all rounds have been played and the winner declared, the program must ask the user if he/she wants to play again.
// If the user says No, the program prints out a message saying, “Thanks for playing!” and then exits.
// If the user says Yes, the program starts over, asking the user how many rounds he/she would like to play.