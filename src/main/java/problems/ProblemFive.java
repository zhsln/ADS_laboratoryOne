package problems;

import java.util.Scanner;

public class ProblemFive {
    public static void fifthProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of element of Fibonacci sequence: ");
        int num = scanner.nextInt();

        System.out.println("Answer: " + solveFibonacci(num) + ".");
    }

    private static int solveFibonacci(int num) { /* Askar agay in 1st trimester said
                                                    that function name should start with a verb. */
        if (num <= 1) // Base case.
            return num;

        return solveFibonacci(num - 1) + solveFibonacci(num - 2); // Recursive case.
    }
}