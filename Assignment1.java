
/*
 * Name: Renad Saleh
 * Student ID: 446043993
 * Date: 14 May 2025
 * Description: This program stores 8 positive numbers in an array,
 * calculates their sum, and then displays the square root of the sum.
 */

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 8 double numbers
        double[] numbers = new double[8];

        // Variable to store the sum of all numbers
        double sum = 0;

        // Loop to collect 8 valid (positive) numbers from the user
        for (int i = 0; i < numbers.length; i++) {
            double input;

            // Keep asking until a valid positive number is entered
            while (true) {
                System.out.print("Enter positive number #" + (i + 1) + ": ");
                input = scanner.nextDouble();

                // Check if the input is positive
                if (input > 0) {
                    numbers[i] = input; // Store valid number in the array
                    break; // Exit the while loop
                } else {
                    // Show error message and prompt again
                    System.out.println("Invalid input. Please enter a positive number.");
                }
            }

            // Add the number to the sum
            sum += numbers[i];
        }

        // Use Math class to calculate the square root of the sum
        double squareRoot = Math.sqrt(sum);

        // Display the total sum
        System.out.println("\nTotal sum: " + sum);

        // Display the square root of the sum
        System.out.println("Square root of the sum: " + squareRoot);

        // Close the scanner to free resources
        scanner.close();
    }
}
