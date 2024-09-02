import java.util.Scanner;

public class seriessumandsub {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=number;i++){
            if (i%2==0){
                sum1=sum1+i;
            }
            else{
                sum2=sum2+i;
            }
        }
        System.out.println("Sum of series is:"+(sum2-sum1));

    }
}
