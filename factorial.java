import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        int n=1;
        for (int i=1;i<=number;i++){
            n=n*i;

        }
        System.out.println("Factorial is:"+n);
    }
}
