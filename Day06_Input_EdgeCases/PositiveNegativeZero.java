/**
 * Question:
 * Check whether a number is Positive, Negative, or Zero.
 *
 * Explanation:
 * - If number > 0 → Positive
 * - If number < 0 → Negative
 * - Else → Zero
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day06_Input_EdgeCases;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        int number = -8; // input number

        // check conditions
        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative Number.");
        } else {
            System.out.println(number + " is Zero.");
        }
    }
}
