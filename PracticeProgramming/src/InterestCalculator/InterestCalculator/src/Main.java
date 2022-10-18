import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        // Ask user for total investment
        System.out.println("How much do you want to invest?");

        //Create Scanner
        Scanner input = new Scanner(System.in);
        int totalInvest = input.nextInt();

        // Ask user for years of investing
        System.out.println("How many years are investing? ");
        int yearsOfInvest = input.nextInt();

        // Ask user for interest rate
        System.out.println("What is the annual interest rate % growth?");
        int interestRate = input.nextInt();

        double earned = calculateInterest(totalInvest, interestRate);

        System.out.println("Calculating...");
        System.out.println("Year 1:");
        System.out.println("Began with $" + totalInvest);
        System.out.println("Earned $" + df.format((earned - totalInvest)));
        System.out.println("Ended with $" + df.format(earned));
    }

    public static double calculateInterest(double currentBalance, double annualInterestRate) {
        // Calculate the interest after 1 year
        double interest = currentBalance * (Math.pow((1 +((annualInterestRate/4)/100)), 4));
        System.out.println("I've calculated the interest is... " + interest);
        return interest;
    }
}
