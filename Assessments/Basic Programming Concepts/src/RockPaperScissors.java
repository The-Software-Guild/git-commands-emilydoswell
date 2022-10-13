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

                // Generate number between 1 and 3.
                Random rng = new Random();
                int randomNumber = rng.nextInt(3) + 1;

                // 3 variables to track wins and ties.
                int computerWins = 0;
                int userWins = 0;
                int tie = 0;

                // After the computer asks for the user’s input, the computer randomly chooses
                // Rock, Paper, or Scissors and displays the result of the round (tie, user win, or computer win).
                for (int i = 0; i < userInput; i++) {
                    // The computer asks the user for his/her choice (Rock, Paper, or Scissors).
                    System.out.println("type 1 for 'rock', 2 for 'paper' or 3 for 'scissors' when you're ready, go!");
                    int userTurn = input.nextInt();

                    if (userTurn == randomNumber) {
                        System.out.println("Oops that's a tie!");
                        tie += 1;
                    } else if ((userTurn == 1 && randomNumber == 2) || (userTurn == 3 && randomNumber == 1) || (userTurn == 2 && randomNumber == 3) ) {
                        System.out.println("I win!");
                        computerWins =+ 1;
                    } else if ((userTurn == 2 && randomNumber == 1) || (userTurn == 1 && randomNumber == 3) || (userTurn == 3 && randomNumber == 2) ) {
                        System.out.println("You win!");
                        userWins += 1;
                    } else {
                        System.out.println("I'm sorry I don't recognise that number");
                    }
                }

                // Print out the number of ties, user wins, and computer wins.
                System.out.println("That's the end, here's the stats");
                System.out.println("Ties: " + tie);
                System.out.println("Computer wins: " + computerWins);
                System.out.println("User wins " + userWins);

                // Declare the overall winner based on who won more rounds.
                if ((tie > computerWins) && (tie > userWins) ) {
                    System.out.println("So... overall, it's a tie" );
                } else if (computerWins > userWins) {
                    System.out.println("So... I win overall!");
                } else if (userWins > computerWins) {
                    System.out.println("So... You win overall! Congratulations");
                } else {
                    System.out.println("It's a tie!");
                }

                // Ask user to play again
                System.out.println("Would you like to play again, y/n?");
                String userAnswer = input.next();
        }
}

// After all rounds have been played and the winner declared, the program must ask the user if he/she wants to play again.
// If the user says No, the program prints out a message saying, “Thanks for playing!” and then exits.
// If the user says Yes, the program starts over, asking the user how many rounds he/she would like to play.