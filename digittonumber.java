import java.util.Scanner;
public class digittonumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int num=0;
        String str="";
        while (number!=0){
            num=number%10;
            number=number/10;
            str=str+num;
        }
        System.out.println("reverse number is:"+str);
        
        for (int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
        
        switch (c) {
            case '0':
            System.out.println("Zero");                
                break;
        
        
            case '1':
            System.out.println("One");                
                break;
        
        
            case '2':
            System.out.println("Two");                
                break;
        
        
            case '3':
            System.out.println("Three");                
                break;
        
        
            case '4':
            System.out.println("Four");                
                break;
        
        
            case '5':
            System.out.println("Five");                
                break;
        
        
            case '6':
            System.out.println("Six");                
                break;
        
        
            case '7':
            System.out.println("Seven");                
                break;
        
        
            case '8':
            System.out.println("Eight");                
                break;
        
        
            case '9':
            System.out.println("Nine");                
                break;
        }
    }
    
    }
}
