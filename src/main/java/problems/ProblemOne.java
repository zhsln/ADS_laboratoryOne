package problems;

import java.util.Scanner;

/**
 * This class contains solution to Problem 1.
 */
public class ProblemOne {
    /**
     * This method contains only a Scanner, which takes values for calculations.
     */
    public static void firstProblem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size of array: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine(); // It is mandatory after using nextInt().

        System.out.print("Enter an integers separated by space: ");
        String[] input = scanner.nextLine().split(" "); // User input...

        int[] numbers = new int[arraySize]; // Parsing user input to int[] array.
        for (int i = 0; i < arraySize; i++)
            numbers[i] = Integer.parseInt(input[i]);

        System.out.println("Min of the array: " + findMin(numbers) + ".");
    }

    /**
     * This method finds the smallest number in the array,
     * using comparative operator and bubble sort.
     * Time complexity: O(n), where n is the size of array.
     * The algorithm iterates through all numbers from 0 to n,
     * resulting in linear time complexity.
     *
     * @param numbers The array that filled with integers.
     * @return The smallest number in the array.
    */
    public static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] < min) { // Bubble sort.
                int temp = numbers[i];
                numbers[i] = min;
                min = temp;
            }

        return min;
    }
}