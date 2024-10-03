import java.util.Scanner;

public class checksortedarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,4};
        
        boolean issorted=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                issorted=true;
                
            }
            else{
                issorted=false;
            }
        
        }if(issorted){
            System.out.println("yes sorted");
        }
        else{
            System.out.println("not sorted");;
        }
    }
}
