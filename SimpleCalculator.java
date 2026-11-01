import java.util.Scanner;

/**
 * SimpleCalculator
 * Reads two numbers from the user and shows the result of the basic
 * arithmetic operations: addition, subtraction, multiplication,
 * division and remainder.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        System.out.println();
        System.out.println("Results:");
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);

        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            double remainder = firstNumber % secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);
            System.out.println(firstNumber + " % " + secondNumber + " = " + remainder);
        } else {
            System.out.println("Division and remainder are not possible because the second number is 0.");
        }

        input.close();
    }
}
