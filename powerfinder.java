import java.util.*;
public class powerfinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number=1;
        for (int i=1;i<=number2;i++){
            number=number*number1;

        }
        System.out.println("the output is:"+number);
    }
    
}
