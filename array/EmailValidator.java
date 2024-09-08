import java.util.Scanner;

public class EmailValidator {

    public static boolean isValidEmail(String email) {
        // Check if there is exactly one '@' symbol
        int index = email.indexOf('@');
        if (index == -1 || email.indexOf('@', index + 1) != -1) {
            return false;
        }

        // Check if there is at least one '.' after the '@' symbol
        int dotPosition = email.indexOf('.', index);
        
        // If there is no '.' after '@', return false
        if (dotPosition == -1) {
            return false;
        }

        // Check if there are no spaces in the email
        if (email.contains(" ")) {
            return false;
        }

        // If all checks pass, return true
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = sc.nextLine();

        if (isValidEmail(email)) {
            System.out.println("The email address is valid.");
        } else {
            System.out.println("The email address is invalid.");
        }

        sc.close();
    }
}
