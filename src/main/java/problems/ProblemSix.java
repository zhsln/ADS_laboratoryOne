package problems;

import java.util.Scanner;

/**
 * This class contains solution to Problem 6.
 */
public class ProblemSix {
    /**
     * This method contains only a Scanner, which takes values for calculations.
     */
    public static void sixthProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int a = scanner.nextInt();
        System.out.print("Enter degree number: ");
        int n = scanner.nextInt();

        System.out.println("Answer: " + pow(a, n) + "."); // This is pow(), NOT Math.pow().
    }

    /**
     * This method finds the A in power of B, where A and B are input numbers.
     * It uses a recursive approach.
     * Time complexity: O(B), where B is the degree to which the number A is raised.
     * The recursive algorithm makes recursive calls,
     * reducing the degree of B by 1 at each step, until it reaches the base case,
     * resulting in linear time complexity.
     *
     * @param a base number
     * @param b degree number
     * @return an A in power of B.
     */
    public static int pow(int a, int b) {
        if (b == 1) // Base case.
            return a;

        return a * pow(a, b - 1); // Recursive base.
    }
}
