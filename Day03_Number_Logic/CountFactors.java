/**
 * Question:
 * Count the total number of factors of a given number.
 *
 * Explanation:
 * - A factor divides the number without remainder
 * - Loop from 1 to number
 * - Increment count if divisible
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day03_Number_Logic;

public class CountFactors {

    public static void main(String[] args) {

        int num = 36; // input number
        int factorCount = 0; // to count factors

        // loop from 1 to num to find factors
        for (int i = 1; i <= num; i++) {

            // If i divides num completely, it is a factor
            if (num % i == 0) {
                factorCount++;
            }
        }
        System.out.println("Number of factors of " + num + " is: " + factorCount);
    }

}
