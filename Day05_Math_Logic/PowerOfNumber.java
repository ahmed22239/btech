/**
 * Question:
 * Find power of a number without using Math.pow().
 *
 * Explanation:
 * - Multiply base with itself exponent times
 *
 * Example:
 * base = 2, exponent = 5 → 2 × 2 × 2 x 2 x 2= 32
 *
 * Time Complexity: O(exponent)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day05_Math_Logic;

public class PowerOfNumber {

    public static void main(String[] args) {

        int base = 2; // base value
        int exponent = 5; // exponent value
        int result = 1; // store final result

        // multiply base exponent times
        for (int i = 1; i <= exponent; i++) {

            result = result * base;
        }

        // print result
        System.out.println("Result : " + result);
    }

}
