import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();

            if (number1 == number2) {
                System.out.println("The numbers are equal.");
            } else if (number1 < number2) {
                System.out.println("The first number is less than the second number.");
            } else {
                System.out.println("The second number is less than the first number.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }
}
