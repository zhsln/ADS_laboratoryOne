package problems;

import java.util.Scanner;

/**
 * This class contains solution to Problem 4.
 */
public class ProblemFour {
    /**
     * This method contains only a Scanner, which takes values for calculations.
     */
    public static void fourthProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Factorial of a number: " + factorial(num) + ".");
    }

    /**
     * This method calculates the factorial of a given number,
     * using a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * The recursive algorithm iterates through all numbers from n to 1,
     * resulting in linear time complexity.
     *
     * @param num The number for which the factorial is to be calculated
     * @return The factorial of the given number
     */
    public static int factorial(int num) {
        if (num == 0 || num == 1) // Base case.
            return 1;

        else // Recursive case.
            return num * factorial(num - 1);
    }
}
