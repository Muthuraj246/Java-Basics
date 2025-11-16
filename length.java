
import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
        str =sc.nextLine();
        System.out.println(str.length());
        System.out.println("First charecter of the string is");
        System.out.println(str.charAt(0));
        System.out.println("Last charecter of the string is");
        System.out.println(str.charAt(str.length()-1));

     sc.close();
    }
   
}
