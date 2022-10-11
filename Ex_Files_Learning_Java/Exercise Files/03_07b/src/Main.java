import java.util.Scanner; 

public class Main {

    public static void main(String args[]) {
        String question = "What day is it?";
        String choiceOne = "Monday";
        String choiceTwo = "Sunday";
        String choiceThree = "Thursday";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("Here are the options");
        System.out.println("A:" + choiceOne + ", B:" + choiceTwo + ", C:" + choiceThree + ". Type the day");

        // Have the user input an answer
        Scanner input = new Scanner(System.in);

        // Retrieve the user's input
        String userInput = input.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        if (userInput.equals(correctAnswer)) {
            System.out.println("Well done, that is correct");
        } else {
            System.out.println("Unfortunately this is not correct");
        }
    }

}
