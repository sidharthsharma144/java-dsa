//OBJECTS ARE INSTANCE OF CLASS
public class copyconstructer{
    public static class Student{
    
    public String name;
    public double percentage;
    public int roll;

    // Student(){  //non parameterized constructer
    //     System.out.println("constructer called");
    // }
    Student(String name, int roll){  //non parameterized constructer
        this.name=name;
        this.roll=roll;   
    }
    Student(Student s2){  //non parameterized constructer
        this.name=s2.name;
        this.roll=s2.roll;   
    }
    }
    public static void main(String[] args) {
        
        Student a=new Student("aman",24);   // this is for declaration of dbba or u can say we created the objects
        // a.name="sidharth";
        // a.roll=79;
        // a.percentage=74;
        System.out.println(a.name); 

        Student s2=new Student(a); 

        System.out.println(s2.name);;;;;;;;;

    }
}