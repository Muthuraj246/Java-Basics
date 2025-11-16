public class Break {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==0){
                System.err.println("Breaking the loop at i= "+i);
                break;
            }
            System.err.println("i="+i);
        }
    }
    
}                                                                                                           