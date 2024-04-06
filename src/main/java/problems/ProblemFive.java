package problems;

import java.util.Scanner;

public class ProblemFive {
    public static void fifthProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of element of Fibonacci sequence: ");
        int num = scanner.nextInt();

        System.out.println("Answer: " + solveFibonacci(num) + ".");
    }

    /**
     * This method finds the n-th element of Fibonacci sequence, where n is the input number.
     * It uses a recursive approach.
     * Time complexity: O(2^n), where n is the number of element in Fibonacci sequence.
     * The recursive algorithm makes two recursive calls, one for num - 1 and one for num - 2.
     * resulting in exponential time complexity.
     *
     * @param num The number of element in Fibonacci sequence.
     * @return The n-th element of Fibonacci sequence.
     */
    private static int solveFibonacci(int num) { /* Askar agay in 1st trimester said
                                                    that function name should start with a verb. */
        if (num <= 1) // Base case.
            return num;

        return solveFibonacci(num - 1) + solveFibonacci(num - 2); // Recursive case.
    }
}