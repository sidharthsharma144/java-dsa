package pattern;

import java.util.Scanner;

public class Lpattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for (int i=1;i<=number;i++){
            for (int j=1;j<=number+1-i;j++){               
                System.out.print("*");
            }System.err.println();
            
        }
    }
}
