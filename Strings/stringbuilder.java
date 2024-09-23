package strings;
import java.util.Scanner;
public class stringbuilder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("tony");

        // sb.insert(0,"S");
        // System.out.println(sb);

        // sb.append("e");
        // sb.append("l");
        // sb.append("f");
        // sb.append("l");

        // System.out.println(sb);
        for (int i=0;i<sb.length()/2;i++){
            int front =i;
            int back=sb.length()-1-i;

            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }

        System.out.println(sb);


    }
}
