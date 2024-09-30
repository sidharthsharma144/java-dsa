import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomStringSorter {
    public static void main(String[] args) {
        // Create a list to hold random strings
        List<String> stringList = new ArrayList<>();

        // Generate random strings
        String[] sampleWords = {"apple", "banana", "grape", "orange", "kiwi", "mango", "pear", "peach", "cherry", "plum"};
        Random random = new Random();

        // Populate the ArrayList with random strings
        for (int i = 0; i < 10; i++) {
            // Select a random word from the sampleWords array
            String randomString = sampleWords[random.nextInt(sampleWords.length)];
            stringList.add(randomString);
        }

        System.out.println("Original List: " + stringList);

        // Sort the list in descending order
        Collections.sort(stringList, Collections.reverseOrder());

        System.out.println("Sorted List (Descending): " + stringList);
    }
}
