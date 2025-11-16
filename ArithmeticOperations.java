///Write a Java program to input two integers and display their sum, difference, product, quotient, and remainder.
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        if (num2 != 0) {
            int quotient = num1 / num2;
            int remainder = num1 % num2;
            System.out.println("\nResults:");
            System.out.println("Sum = " + sum);
            System.out.println("Difference = " + difference);
            System.out.println("Product = " + product);
            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        } else {
            System.out.println("\nDivision and remainder cannot be performed (division by zero).");
            System.out.println("Sum = " + sum);
            System.out.println("Difference = " + difference);
            System.out.println("Product = " + product);
        }
        sc.close();
    }
}
