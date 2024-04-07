package problems;

import java.util.Scanner;

/**
 * This class contains solution to Problem 7.
 */
public class ProblemSeven {
    /**
     * This method contains only a Scanner, which takes values for calculations.
     */
    public static void seventhProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int sequenceLength = scanner.nextInt();

        System.out.print("Enter the sequence of elements separated by space: ");
        System.out.println("Reversed sequence: ");
        displayReverseSequence(scanner, sequenceLength);
    }

    /**
     * This method displays reversed sequence of integers in reversed order without using array.
     * Time complexity: O(n), where n is the amount of numbers to be counted and output.
     * The recursive algorithm iterates through all numbers from n to 1,
     * resulting in linear time complexity.
     *
     * @param scanner just util.Scanner
     * @param n the length of sequence.
     */
    public static void displayReverseSequence(Scanner scanner, int n) {
        if (n <= 0) // Base case.
            return;

        int num = scanner.nextInt();

        displayReverseSequence(scanner, n - 1); // Recursive case.

        System.out.print(num + " "); // Printing number.
    }
}
