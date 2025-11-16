///Create a program that checks if a person is eligible to vote — eligibility requires age ≥ 18 and citizenship = true (use logical AND).
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = sc.nextBoolean();

        if (age >= 18 && isCitizen)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("You are not eligible to vote.");

        sc.close();
    }
}
