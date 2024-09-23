import java.io.*;
import java.util.Scanner;

public class CapitalizeWords {

    // Method to capitalize the first letter of each word in a line
    public static String capitalizeFirstLetter(String line) {
        // Split the line by spaces (this will handle multiple spaces too)
        String[] words = line.split("\\s+");
        StringBuilder capitalizedLine = new StringBuilder();

        // Iterate over each word
        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize the first letter and append the rest of the word
                capitalizedLine.append(Character.toUpperCase(word.charAt(0)))
                               .append(word.substring(1)).append(" ");
            }
        }

        // Return the line with the first letter of each word capitalized
        return capitalizedLine.toString().trim();
    }

    public static void main(String[] args) {
        // Input and output file paths
        String inputFilePath = "input.txt";  // Replace with the path to your input file
        String outputFilePath = "output.txt";  // Replace with the path to your output file

        // Try-with-resources to automatically close file readers/writers
        try (Scanner scanner = new Scanner(new File(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            // Read the file line by line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Capitalize the first letter of each word in the line
                String capitalizedLine = capitalizeFirstLetter(line);

                // Write the capitalized line to the output file
                writer.write(capitalizedLine);
                writer.newLine();  // Add a newline to separate lines
            }

            System.out.println("The content has been successfully processed and written to: " + outputFilePath);

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
            e.printStackTrace();
        }
    }
}
