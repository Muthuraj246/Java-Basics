//Write a program to perform bitwise AND, OR, and XOR operations on two integers entered by the user, and print the binary results.
import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;

        System.out.println("\nBitwise AND: " + Integer.toBinaryString(andResult));
        System.out.println("Bitwise OR: " + Integer.toBinaryString(orResult));
        System.out.println("Bitwise XOR: " + Integer.toBinaryString(xorResult));

        sc.close();
    }
}

