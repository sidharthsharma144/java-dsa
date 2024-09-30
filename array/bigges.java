import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class bigges{
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        String[] sampleWords = {"apple", "banana", "grape", "orange", "kiwi", "mango", "pear", "peach", "cherry", "plum"};
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String randomString = sampleWords[random.nextInt(sampleWords.length)];
            stringList.add(randomString);
        }
        Collections.sort(stringList, Collections.reverseOrder());
        System.out.println(stringList);
    }
}
