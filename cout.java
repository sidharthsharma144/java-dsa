import java.util.Scanner;
class cout{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = sc.nextInt();
    int count = 0;
    int num=0;
    if (number == 0) {
        count = 1;
    } else {
        while (number != 0) {
            num=number%10;
            number = number / 10;
           
            count=count+num; 
        }
    }

    System.out.println("The number of digits are: " + count);
}
}