import java.util.Scanner;
public class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        long number1=input.nextLong();
        long number2=input.nextLong();
        long number3=input.nextLong();
        long minimum=Math.min(Math.min(number1,number2),number3);
        System.out.print(minimum);
        input.close();
    }
}