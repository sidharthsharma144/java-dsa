import java.util.*;
public class justgreater {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int start=0;
        int end=size-1;
        int mid=(start+end)/2;
        for(int i=0;i<size;i++){
            if(arr[mid]>target){
                start=mid+1;
                mid=(start+end)/2;
            }
            if(arr[mid]<target){
                end=mid-1;
                mid=(start+end)/2;;;
            }
        }
    }
}