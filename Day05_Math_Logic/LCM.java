/**
 * Question:
 * Find the LCM (Least Common Multiple) of two numbers.
 *
 * Explanation:
 * - LCM is the smallest number divisible by both numbers
 * - Start checking from maximum of both numbers
 *
 * Formula (logic-based):
 * LCM = (a * b) / GCD
 *
 * Time Complexity: O(min(a, b))
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day05_Math_Logic;

public class LCM {

    public static void main(String[] args) {

        int a = 12; // first number
        int b = 18; // second number
        int gcd = 1; // variable to store gcd

        // calculate GCD first
        for (int i = 1; i <= a && i <= b; i++) {

             // check common divisor
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }

        }

        // calculate LCM using formula
        int lcm = (a * b) / gcd;

        System.out.println("LCM = " + lcm);
    }

}
