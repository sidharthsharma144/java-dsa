// CHANGING THE VALUE IN THE FUNCTION OF CLASS

import java.util.Scanner;

public class functionchange {

    public static class Cars{
        public  String name;
        public String model;
        public double speed;
        public double price;
    }

    public static void update(Cars a){
        a.name="mercedes";
   
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        Cars s=new Cars();

        s.name=sc.nextLine();
        s.model="B3";
        s.speed=394.4;
        
        
        System.out.println(s.name);
        update(s);
        System.out.println(s.name);
        System.out.println(s.price);;



    }
}
