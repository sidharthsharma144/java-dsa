import java.util.*;

public class woodenlog {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int j=0;
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<size-1;i++){
        if(arr[i]==1){
            if(arr[i+1]==0){
                break;
            }j++;
        }
    }int z=size-1;
    for(int i=size-1;i>0;i--){
        if(arr[i]==1){
            if(arr[i-1]==0){
                break;
            }z--;
        }
    }
    System.out.println("the minimum fuel required is: "+ (z-j));

}
}
