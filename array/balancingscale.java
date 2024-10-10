import java.util.*;
public class balancingscale {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int[] right = new int[size];
        for(int i=0;i<size-1;i++){
            sum+=arr[i];
            right[i]=sum;;

        }


        int[] left = new int[size];
        int sum1=0;
        for(int i=size-1;i>0;i--){
            
            sum1+=arr[i];
            left[i]=sum1;
        }
        
        boolean equal=false;
        for(int i=0;i<size;i++){
            
            if(left[i]==right[i]){
                System.out.print("index where sum will be equal is: " + i);
                equal=true;
                break;
            }
            
        }
        if(!equal)
        {
           System.out.println("-1");
        }
        // int n;
        // Scanner sc=new Scanner(System.in);
        // n=sc.nextInt();
        // int []a=new int[n];
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        // int l=a[0];
        // int r=a[n-1];
        // int j=n-2;
        // int c=-1;
        // int i=1;
        // while(i<j){
        //     if(l>r){
        //         r+=a[j];
        //         j--;
        //     }
        //     else if(l<r){
        //         l+=a[i];
        //         i++;
        //     }
        //     else{
        //         c=i;
        //     }
        // }
        // System.out.println("ans is "+c);

        
    }
}
