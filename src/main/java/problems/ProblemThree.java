package problems;

import java.util.Scanner;

public class ProblemThree {
    public static void thirdProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrimeNumber(num)) System.out.println("Prime");
        else System.out.println("Composite");
    }

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