import java.util.Arrays;

public class OptimizedPrimeNumbers {

    public static int sieveOfEratosthenes(int n) {
        if (n < 2) {
            return 0;  // No primes below 2
        }
        
        // Create a boolean array, only considering odd numbers
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;  // 0 and 1 are not primes
        
        int count = 1;  // Start count with 2 (the only even prime)
        
        // Process odd numbers only, skipping even numbers
        for (int p = 3; p * p <= n; p += 2) {
            if (isPrime[p]) {
                // Mark all odd multiples of p as false starting from p^2
                for (int i = p * p; i <= n; i += 2 * p) {
                    isPrime[i] = false;
                }
            }
        }

        // Count primes, starting from 3 and skipping even numbers
        for (int p = 3; p <= n; p += 2) {
            if (isPrime[p]) {
                count++;
                System.out.print(p +" ");
            }
        }
        
        return count;  // Return the total number of primes
    }

    public static void main(String[] args) {
        int n = 100;  // Find primes up to this value
        int count = sieveOfEratosthenes(n);
        System.out.println("Number of prime numbers up to " + n + ": " + count);
    }
}
