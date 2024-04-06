package problems;

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class ProblemEight {
    public static void eighthProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Does the string contain only digits?");
        if (isOnlyDigits(input, 0))
            System.out.println("Yes.");
        else
            System.out.println("No.");
    }

    /**
     * This method checks if the input string contains only digits.
     * Time complexity: O(n), where n is the length of input string.
     * The recursive algorithm iterates through all characters with index 0 to n, where n is the length of input string.
     *
     * @param input User's string
     * @param index The index of character in String.
     * @return
     */
    private static boolean isOnlyDigits(String input, int index) {
        if (input.length() == index) // Base case.
            return true;

        if (isDigit(input.charAt(index))) // Recursive case.
            return isOnlyDigits(input, index + 1);

        else // Also base case.
            return false;
    }
}