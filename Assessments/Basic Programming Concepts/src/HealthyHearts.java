import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        // Ask user for age
        System.out.println("What is your age?");

        // Create Scanner
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        // Calculate heart rate
        int maxHeartRate = 220 - userInput;
        int lowTargetHeartRate = maxHeartRate / 2;
        double highTargetHeartRate = maxHeartRate * 0.85;

        // Print out user results
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + lowTargetHeartRate + " - " + highTargetHeartRate + " beats per minute");
    }
}
