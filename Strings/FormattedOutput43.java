package Strings;
import java.util.Scanner;
public class FormattedOutput43 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str="hello this is sidharth";
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                count =count+1;
            }
        }
        System.out.println(count);
    }
}
