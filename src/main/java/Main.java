import problems.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("Select task (1 - 10) or 0 to stop the programme: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Stopping the programme...");
                    break;
                case 1:
                    ProblemOne.firstProblem();
                    break;
                case 2:
                    ProblemTwo.secondProblem();
                    break;
                case 3:
                    ProblemThree.thirdProblem();
                    break;
                case 4:
                    ProblemFour.fourthProblem();
                    break;
                case 5:
                    ProblemFive.fifthProblem();
                    break;
                case 6:
                    ProblemSix.sixthProblem();
                    break;
                case 7:
                    ProblemSeven.seventhProblem();
                    break;
                case 8:
                    ProblemEight.eighthProblem();
                    break;
                case 9:
                    ProblemNine.ninthProblem();
                    break;
                case 10:
                    ProblemTen.tenthProblem();
                    break;
                default:
                    System.err.println("Incorrect choice. Try again.");
            }
        } while (choice != 0);
    }
}