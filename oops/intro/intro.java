//OBJECTS ARE INSTANCE OF CLASS
public class intro{
    public static class Student{
    
    public String Name;
    public double percentage;
    public int roll;

    // Student(){  //non parameterized constructer
    //     System.out.println("constructer called");
    // }
    Student(String name, int roll){  //parameterized constructer
        this.Name=name;
        this.roll=roll;   
    }
    }
    public static void main(String[] args) {
        
        Student a=new Student("aman",24);   // this is for declaration of dbba or u can say we created the objects
        // a.name="sidharth";
        // a.roll=79;
        // a.percentage=74;
        System.out.println(a.Name); 
    }
}