package Strings;
import java.util.Scanner;
public class reversethestring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for (int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            System.out.print(c);
        }

    }
}
