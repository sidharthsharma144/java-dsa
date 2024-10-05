//OBJECTS ARE INSTANCE OF CLASS
public class intro{
    public static class Student{
    
    public String name;
    public double percentage;
    public int roll;
    }
    public static void main(String[] args) {
        
        Student a=new Student();   // this is for declaration of dbba or u can say we created the objects
        a.name="sidharth";
        a.roll=79;
        a.percentage=74;
        System.out.println(a.roll); 
    }
}