import java.util.Scanner;

public class Main { // class compareNumbers
    public static void main(String[] args) { // main()
        Scanner in = new Scanner(System.in);



            try {
                double num1 = Double.parseDouble(in.nextLine());// num integer1 = 0
                System.out.print("Enter the first number: "); // output "Enter the first input:"

                double num2 = Double.parseDouble(in.nextLine());  // num integer2 = 0
                System.out.print("Enter the second number: "); // output "Enter the second input:"


                // Compare the two numbers
                if (num1 == num2) { // if integer1 == integer2 then
                    System.out.println("Both numbers are equal."); // output "The numbers are equal"
                } else if (num1 < num2) { //    if integer1 < integer2 then
                    System.out.println(num1 + " is less than " + num2 + "."); // output integer1 + " is less than " + integer2
                } else {
                    System.out.println(num2 + " is less than " + num1 + "."); //  output integer2 + " is less than " + integer1
                } // end if

            } catch (NumberFormatException e) {
                // Handle non-numeric inputs
                System.out.println("Invalid input. Please enter valid numeric values.");
            }

        in.close();
    } // return
} // end class
