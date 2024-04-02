package problems;

import java.util.Scanner;

public class ProblemFour {
    public static void fourthProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Factorial of a number: " + factorial(num) + ".");
    }

    private static int factorial(int num) {
        if (num == 0 || num == 1) // Base case.
            return 1;

        else // Recursive case.
            return num * factorial(num - 1);
    }
}
