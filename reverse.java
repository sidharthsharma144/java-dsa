
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int num=0;
        while(number!=0){
            num=num*10+number%10;
            number=number/10;
            
        }System.out.println("the reverse is: "+num);
        
    }
}
