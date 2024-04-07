package problems;

import java.util.Scanner;

/**
 * This class contains solution to Problem 10.
 */
public class ProblemTen {
    /**
     * This method contains only a Scanner, which takes values for calculations.
     */
    public static void tenthProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.print("GCD(" + a + "," + b + ") = " + calculateGCD(a, b) + ".");
    }

    /**
     * This method calculates GCD(a,b) (greatest common divisor of a and b), where a and b are input integers.
     * Time complexity: O(log(c)), where c is the min(a,b), because if a > b, GCD(b,a) = GCD(a,b), and vice-versa.
     * The recursive algorithm makes recursive calls, decreasing the values of a and b until b is 0
     *
     * @param a the input integer.
     * @param b the input integer.
     * @return GCD(a,b) (greatest common divisor of a and b)
     */
    public static int calculateGCD(int a, int b) {
        if (b == 0)
            return a;

        return calculateGCD(b, a % b);
    }
}
