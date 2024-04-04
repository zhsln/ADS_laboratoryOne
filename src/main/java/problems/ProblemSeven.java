package problems;

import java.util.Scanner;

public class ProblemSeven {
    public static void seventhProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int arraySize = scanner.nextInt();

        System.out.print("Enter the sequence of elements separated by space: ");
        displayReverseSequence(scanner, arraySize);
    }

    public static void displayReverseSequence(Scanner scanner, int n) {
        if (n <= 0) // Base case.
            return;

        int num = scanner.nextInt();

        displayReverseSequence(scanner, n - 1); // Recursive case.

        System.out.print(num + " "); // Printing number.
    }
}
