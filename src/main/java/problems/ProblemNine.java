package problems;

import java.util.Scanner;

/**
 * This class contains solution to Problem 9.
 */
public class ProblemNine {
    /**
     * This method contains only a Scanner, which takes values for calculations.
     */
    public static void ninthProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        System.out.println("Binomial coefficient, C(" + n + "," + k + "): " + calculateBinomialCoefficient(n, k) + ".");
    }

    /**
     * This method calculates binomial coefficient C(n,k), where n and k are input integers.
     * Time complexity: O(2^n), where n is the value of n.
     * The recursive algorithm calls itself twice with modified parameters.
     *
     * @param n the input integer.
     * @param k the input integer.
     * @return integer C(n,k), where n and k are input integers.
     */
    public static int calculateBinomialCoefficient(int n, int k) {
        if (k == 0 || k == n) // Base case.
            return 1; // according to the task.

        return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);
    }
}