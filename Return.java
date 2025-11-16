public class Return{
    public static void main(String[] args){
        System.out.println("Start Of Program");
        checkNumber(5);
        System.out.println("End Of Program");
    }
    public static void checkNumber(int num){
        if(num<0){
            System.out.println("Negative Number");
            return;
        }
        System.out.println("Positive number or zero");
    }
}