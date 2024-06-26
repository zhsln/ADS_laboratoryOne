package problems;

import java.util.Scanner;

/**
 * This class contains solution to Problem 2.
 */
public class ProblemTwo {
    /**
     * This method contains only a Scanner, which takes values for calculations.
     */
    public static void secondProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine(); // It is mandatory after using nextInt().

        System.out.print("Enter an integers separated by space: ");
        String[] input = scanner.nextLine().split(" "); // User input...

        int[] numbers = new int[arraySize]; // Parsing user input to int[] array.
        for (int i = 0; i < arraySize; i++)
            numbers[i] = Integer.parseInt(input[i]);

        System.out.println("Average value of the array: " + findAvg(numbers) + ".");
    }

    /**
     * This method finds an average value of elements of the array,
     * using comparative operator, incrementation and division.
     * Time complexity: O(n), where n is the size of array.
     * The algorithm iterates through all numbers from 0 to n, where n is the size of array,
     * resulting in linear time complexity.
     *
     * @param numbers The array that filled with integers.
     * @return The average value of elements of the array.
     */
    public static double findAvg(int[] numbers) {
        double sum = 0;
        for (int number : numbers)
            sum += number;

        return sum / numbers.length;
    }
}