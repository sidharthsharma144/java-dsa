package strings;

class Question {
    // Method should return int, not void
    public int shortestDistance(String[] s, String word1, String word2) {
        int count = 0;
        int index1 = -1;
        int index2 = -1;

        // Find index of word1
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(word1)) {
                index1 = i;
                break; // Stop loop when word1 is found
            }
        }

        // Find index of word2
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(word2)) {
                index2 = i;
                break; // Stop loop when word2 is found
            }
        }

        // Calculate the distance between index1 and index2
        if (index1 != -1 && index2 != -1 && index1 < index2) {
            for (int i = index1 + 1; i < index2; i++) {
                count++; // Increment count between indices
            }
        }

        return count; // Return the calculated count
    }

    public static void main(String[] args) {
        String[] S = { "the", "quick", "brown", "fox", "quick" };
        String word1 = "the", word2 = "fox";

        // Create an object of Question class to call the method
        Question q = new Question();
        // Function Call
        System.out.println(q.shortestDistance(S, word1, word2));
    }
}
