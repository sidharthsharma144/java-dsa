import java.util.*;

public class removeduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // Sort the array

        // Using a list to store unique elements
        ArrayList<Integer> res = new ArrayList<>();

        res.add(arr[0]); // Add the first element

        for (int i = 1; i < size; i++) {
            if (arr[i] != arr[i - 1]) { // Check if current element is different from the previous one
                res.add(arr[i]);
            }
        }

        // Print the result
        for (int num : res) {
            System.out.print(num+" ");
        }
    }
}
