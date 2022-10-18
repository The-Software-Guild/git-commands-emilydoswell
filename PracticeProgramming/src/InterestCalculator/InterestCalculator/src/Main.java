import java.util.Scanner;

public class Main {
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
        System.out.println("Earned $" + earned);
        System.out.println("Ended with $" + totalInvest + earned);
    }

    public static double calculateInterest(double currentBalance, double annualInterestRate) {
        // Calculate the interest after 1 year
        double interest = currentBalance * (Math.pow(4)(1 +((annualInterestRate/4)/100)));
        System.out.println("I've calculated the interest is... " + interest);
        return interest;
    }
}

// Can't figure out why 10% annually = 551.91?