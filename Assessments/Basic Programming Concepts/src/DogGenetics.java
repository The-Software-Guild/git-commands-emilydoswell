import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        // Ask user to input dog name
        System.out.println("What is your dog's name?");

        // Create Scanner
        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        // Print response
        System.out.println("Well then, I have this highly reliable report on " + userInput + "'s prestigious background right here.");
        System.out.println(userInput + " is:");

        // Create array of dog breeds
        String[] dogBreeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};

        // Loop through dog breeds array
        for (int i = 0; i < dogBreeds.length; i++) {
            // Generate random number between 0 and 100.
            Random rng = new Random();
            int randomNumber = rng.nextInt(100) + 1;

            // Print percentage along with dog breed
            System.out.println(randomNumber + "% " + dogBreeds[i]);
        }

        // Print finishing statement
        System.out.println("Wow, that's QUITE the dog!");
    }
}
