import java.util.Scanner;

public class biggestamongtheneighbours {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for (int i=0;i<size;i++){
            if(arr[i]<max && arr[i+2]>max){

            }
        }
        }
}
