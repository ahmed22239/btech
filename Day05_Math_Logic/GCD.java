
/**
 * Question:
 * Find the GCD (Greatest Common Divisor) of two numbers.
 *
 * Explanation:
 * - GCD is the largest number that divides both numbers
 * - Loop from 1 to minimum of both numbers
 * - Update gcd whenever a common divisor is found
 *
 * Time Complexity: O(min(a, b))
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day05_Math_Logic;

public class GCD {

    public static void main(String[] args) {

        int a = 36;
        int b = 60;
        int gcd = 1; // store greatest common divisor

        // loop till minimum of a and b
        for (int i = 1; i <= a && i <= b; i++) {

            // check common divisor
            if (a % i == 0 && b % i == 0) {
                gcd = i; // update gcd
            }

        }
        System.out.println("GCD = " + gcd);
    }

}
