
    class Shape{
        String color;
        double area;
    }
    class Trinagle extends Shape{
        public void area(int l,int h){
            System.out.println(0.5*l*h);
        }

    }
    class Circle extends Shape{
        public void area(int r,int h){
            System.out.println(3.14*r*r*h);
        }
    } 
    public class inheritance1 {
    public static void main(String[] args){
        Trinagle t1= new Trinagle();
        t1.color="red";
        System.out.println(t1.color);
        t1.area(5,5);
        Circle c1= new Circle();
        c1.area(3,5);;;;;
    }
}
