/**
 * Question:
 * Count even and odd digits in a number.
 *
 * Explanation:
 * - Extract digits using % 10
 * - Check digit % 2
 *
 * Example:
 * 1234 → Even = 2 (2,4), Odd = 2 (1,3)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day06_Input_EdgeCases;

public class CountEvenOddDigits {

    public static void main(String[] args) {

        int number = 123456;
        int evenCount = 0;
        int oddCount = 0;

        // process digits
        while (number > 0) {

            int digit = number % 10; // extract digit

            // check even or odd
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            number = number / 10; // remove digit

        }

        // print result
        System.out.println("Even Digits = " + evenCount);
        System.out.println("Odd Digits = " + oddCount);
    }

}
