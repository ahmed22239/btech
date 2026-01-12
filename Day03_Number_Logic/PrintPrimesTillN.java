/**
 * Question:
 * Print all prime numbers from 1 to N.
 *
 * Explanation:
 * - Loop from 2 to N
 * - For each number, check if it is prime
 * - Print the number if prime
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day03_Number_Logic;

public class PrintPrimesTillN {

    public static void main(String[] args) {

        int n = 50; //upper limit

        for (int num = 2; num <= n; num++) {

            boolean isPrime = true; // assume number is prime

            // check divisibility 
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // not prime, stop checking
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }

    }
}
