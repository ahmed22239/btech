/**
 * Question: Check whether a number is Even or Odd
 *
 * Explanation:
 * - Use modulo operator (%)
 * - If number % 2 == 0 → Even
 * - Else → Odd
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day01_Basic_Logic;

public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;

        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }

}
