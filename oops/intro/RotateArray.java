// //OBJECTS ARE INSTANCE OF CLASS
// public class copyconstructer{
//     public static class Student{
    
//     public String name;
//     public double percentage;
//     public int roll;

//     // Student(){  //non parameterized constructer
//     //     System.out.println("constructer called");
//     // }
//     Student(String name, int roll){  //non parameterized constructer
//         this.name=name;
//         this.roll=roll;   
//     }
//     Student(Student s2){  //non parameterized constructer
//         this.name=s2.name;
//         this.roll=s2.roll;   
//     }
//     }
//     public static void main(String[] args) {
        
//         Student a=new Student("aman",24);   // this is for declaration of dbba or u can say we created the objects
//         // a.name="sidharth";
//         // a.roll=79;
//         // a.percentage=74;
//         System.out.println(a.name); 

//         Student s2=new Student(a); 

//         System.out.println(s2.name);

//     }
// }
public class RotateArray {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
        for (int num : arr) System.out.print(num + " ");;;
    }
}