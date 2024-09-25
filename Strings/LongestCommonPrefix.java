import java.util.Arrays;  // Import Arrays for sorting

public class LongestCommonPrefix {
    public static void main(String[] args) {
        // Example array of strings
        String[] str = {"geekforgeek", "geeks", "geek"};

        // Check if the array is null or empty
        if (str == null || str.length == 0) {
            System.out.println("-1");
            return;
        }

        // Sort the array of strings
        Arrays.sort(str);

        // Get the first and the last string after sorting
        String firstString = str[0];
        String lastString = str[str.length - 1];

        // Find the minimum length between the first and last strings
        int min = Math.min(firstString.length(), lastString.length());

        int i = 0;
        // Compare the characters of first and last strings
        while (i < min && firstString.charAt(i) == lastString.charAt(i)) {
            i++;
        }

        // If no common prefix, return -1
        if (i == 0) {
            System.out.println("-1");
            return;
        }

        // Print the longest common prefix
        System.out.println("The longest common prefix: " + firstString.substring(0, i));
    }
}
