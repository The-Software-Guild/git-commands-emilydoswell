public class SummativeSums {
    public static void main(String[] args) {
        // Initialise arrays
        int[] ex1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] ex2 = { 999, -60, -77, 14, 160, 301 };
        int[] ex3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };

        // Print sum of each array 
        System.out.println("#1 Array Sum: " + totalArray(ex1));
        System.out.println("#2 Array Sum: " + totalArray(ex2));
        System.out.println("#3 Array Sum: " + totalArray(ex3));
        }

        // Create function add all elements in the array
        public static int totalArray(int[] array) {
            // Initialise counter
            int sum = 0;

            // Loop through array and add each element to counter
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            // Return sum
            return sum;
        }
}
