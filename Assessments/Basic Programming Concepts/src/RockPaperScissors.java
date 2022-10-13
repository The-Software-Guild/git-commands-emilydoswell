import java.util.Scanner;

public class RockPaperScissors {
        public static void main(String[] args) {
            // The program first asks the user how many rounds he/she wants to play.
            System.out.println("Hello! Welcome to Rock, Paper, Scissors!");
            System.out.println("How many rounds would you like to play, between 1 and 10?");

            // Create Scanner
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();

            // Print out user input
            System.out.println("You entered: " + userInput + " times");

        }

}

// Maximum number of rounds = 10, minimum number of rounds = 1.  If the user asks for something outside this range, the program prints an error message and quits.
// If the number of rounds is in range, the program plays that number of rounds.  Each round is played according to the requirements below.
// For each round of Rock, Paper, Scissors, the program does the following:
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