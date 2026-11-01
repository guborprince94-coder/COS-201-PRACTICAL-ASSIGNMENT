import java.util.Scanner;

/**
 * AverageCalculator
 * Reads three scores from the user, then calculates and displays
 * their total and average.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Average Calculator ===");

        System.out.print("Enter the first score: ");
        double score1 = input.nextDouble();

        System.out.print("Enter the second score: ");
        double score2 = input.nextDouble();

        System.out.print("Enter the third score: ");
        double score3 = input.nextDouble();

        double total = score1 + score2 + score3;
        double average = total / 3;

        System.out.println();
        System.out.println("Total   = " + total);
        System.out.printf("Average = %.2f%n", average);

        input.close();
    }
}
