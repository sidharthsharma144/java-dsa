import java.util.Scanner;

public class biggestamongtheneighbours {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        if (size < 3) {
            System.out.println("Array size should be at least 3 to have neighbors.");
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // Initialize max to the smallest possible value
        int max = Integer.MIN_VALUE;

        // Iterate from the second to the second last element
        for (int i = 1; i < size - 1; i++){
            // Find the maximum among the current element and its neighbors
            int currentMax = Math.max(arr[i - 1], Math.max(arr[i], arr[i + 1]));
            if (currentMax > max) {
                max = currentMax;
            }
        }

        System.out.println("The biggest element among the neighbors is: " + max)
    }
}
