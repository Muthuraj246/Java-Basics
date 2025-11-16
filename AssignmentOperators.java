///Write a program to demonstrate +=, -=, and *= operations on an integer variable and display the result after each operation.
import java.util.Scanner;

public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        num += 5;
        System.out.println("After += 5, value = " + num);

        num -= 3;
        System.out.println("After -= 3, value = " + num);

        num *= 2;
        System.out.println("After *= 2, value = " + num);

        sc.close();
    }
}

