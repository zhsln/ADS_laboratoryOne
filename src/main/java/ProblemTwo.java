import java.util.Scanner;

public class ProblemTwo {
    public static void secondProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine(); // It is mandatory after using nextInt().

        System.out.print("Enter an integers separated by space: ");
        String[] input = scanner.nextLine().split(" "); // User input...

        int[] numbers = new int[arraySize]; // Parsing user input to int[] array.
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        System.out.println("Average value of the array: " + findAvg(numbers));
    }

    private static double findAvg(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];

        return sum / numbers.length;
    }
}
