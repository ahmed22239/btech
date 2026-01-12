/**
 * Question:
 * Check whether a given number is prime.
 *
 * Explanation:
 * - A prime number has exactly two factors: 1 and itself
 * - Check divisibility from 2 to number / 2
 * - If divisible by any number, it is not prime
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day03_Number_Logic;

public class PrimeNumber {
    public static void main(String[] args) {

        int num = 29;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is Prime Number.");
        } else {
            System.out.println(num + " is Not a Prime Number.");
        }
    }

}
