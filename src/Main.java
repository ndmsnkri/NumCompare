import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


            try {
                // Get user input for the first number
                System.out.print("Enter the first number: ");
                double num1 = Double.parseDouble(in.nextLine());

                // Get user input for the second number
                System.out.print("Enter the second number: ");
                double num2 = Double.parseDouble(in.nextLine());

                // Compare the two numbers
                if (num1 == num2) {
                    System.out.println("Both numbers are equal.");
                } else if (num1 < num2) {
                    System.out.println(num1 + " is less than " + num2 + ".");
                } else {
                    System.out.println(num2 + " is less than " + num1 + ".");
                }

            } catch (NumberFormatException e) {
                // Handle non-numeric inputs
                System.out.println("Invalid input. Please enter valid numeric values.");
            }

        in.close();
    }
}
