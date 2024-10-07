
public class Multilevel {
    public static class Animal{
        public String name;
        public String type;;;;;
    }
    public static class Mammal extends Animal{
        public void language(){
            System.out.println("this is mammal class");
        }
    }
    public static class Dog extends Mammal{
        public void bark(String Name){
            this.name=Name;
            System.out.println("dog is barking:"+ this.name);
        }
        
    }
    public static class Main{
        public static void main(String[] args){
            Dog d1=new Dog();

            d1.name="harpher";
            d1.bark(d1.name);
        }
    }
}
