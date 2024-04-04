package problems;

import java.util.Scanner;

public class ProblemSix {
    public static void sixthProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int a = scanner.nextInt();
        System.out.print("Enter degree number: ");
        int n = scanner.nextInt();

        System.out.println("Answer: " + pow(a, n) + "."); // This is pow(), NOT Math.pow().
    }

    private static int pow(int a, int b) {
        if (b == 1) // Base case.
            return a;

        return a * pow(a, b - 1); // Recursive base.
    }
}
