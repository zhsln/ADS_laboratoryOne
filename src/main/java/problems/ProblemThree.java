package problems;

import java.util.Scanner;

public class ProblemThree {
    public static void thirdProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrimeNumber(num)) System.out.println("Prime.");
        else System.out.println("Composite.");
    }

    /**
     * This method finds is number prime or not,
     * using division and comparative operator.
     * Time complexity: O(n), where n is the input number.
     * The algorithm iterates through all numbers from 2 to n,
     * resulting in linear time complexity.
     *
     * @param num The number that will be tested whether it is prime or not.
     * @return true or false, depending on whether the number is prime or not.
     */
    private static boolean isPrimeNumber(int num) {
        if (num <= 1)
            return false;

        else
            for (int i = 2; i <= num / 2; i++)
                if ((num % i) == 0)
                    return false;

        return true;
    }
}