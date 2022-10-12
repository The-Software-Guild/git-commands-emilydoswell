import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Program to calculate cost of window glass and trim
        // String for height and width
        String stringHeight;
        String stringWidth;

        // Float for height and width
        Float height;
        Float width;

        // Float for area of window, perimeter of window, cost
        Float areaOfWindow;
        Float cost;
        Float perimeterOfWindow;

        // Ask user for height in feet
        System.out.println("What is the height of the window in feet?");

        /* Declare and initialise a Scanner object,
        scanner reads input from the console */
        Scanner myScanner = new Scanner(System.in);

        // Assign user input to height variable
        stringHeight = myScanner.nextLine();

        // Ask user for width in feet
        System.out.println("What is the width of the window in feet?");

        // Assign user input to width variable
        stringWidth = myScanner.nextLine();

        // Convert String to Float for height and width
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        // Calculate the area of the window
        areaOfWindow = height * width;

        // Calculate the perimeter of the window
        perimeterOfWindow = 2 * (width + height);

        // Calculate cost of Window
        cost = (areaOfWindow * 3.5f) + (perimeterOfWindow * 2.25f);
        System.out.println(cost);

        // Display the results
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total cost = " + cost);
    }
}

