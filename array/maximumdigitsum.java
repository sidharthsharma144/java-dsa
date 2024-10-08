import java.util.*;
public class maximumdigitsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int n=0;
        for(int i=0;i<size;i++){
            int number=arr[i];
            while(number!=0){
            n=n+number%10;
            number=number/10;
        }
    }
        Arrays.sort(arr);

        int [] a=new int[size];
        int [] b=new int [size];
        for(int i=0;i<size;i++){
            a[i]=arr[size-i];;
        }
    }
}
