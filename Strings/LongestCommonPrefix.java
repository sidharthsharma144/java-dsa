package Strings;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        // Find the minimum length of both strings
        int minLength = Math.min(str1.length(), str2.length());
        StringBuilder prefix = new StringBuilder();

        // Loop to find the longest common prefix
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                prefix.append(str1.charAt(i));
            } else {
                break;  // Stop if characters differ
            }
        }

        // Print the result
        if (prefix.length() > 0) {
            System.out.println("Longest common prefix: " + prefix.toString());
        } else {
            System.out.println("No common prefix.");
        }
        
        sc.close();
    }
}
