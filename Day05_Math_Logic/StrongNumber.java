/**
 * Question:
 * Check whether a number is a Strong number.
 *
 * Strong Number:
 * - Sum of factorial of digits equals the number
 *
 * Example:
 * 145 → 1! + 4! + 5! = 145
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day05_Math_Logic;

public class StrongNumber {

    public static void main(String[] args) {

        int num = 145;          // input number
        int original = num;     // store original value
        int sum = 0;            // sum of factorials

        // extract digits ont by one
        while (num > 0) {

            int digit = num % 10;   // get last digit
            int fact = 1;           // factorial of digit

            // calculate factorial using loop
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            // add factorial to sum
            sum = sum + fact;

            // remove last digit
            num = num / 10;
        }

        // compare sum with original number
        if (sum == original) {
            System.out.println(num + "Strong Number.");
        } else {
            System.out.println(num + "Not a Strong Number.");
        }
    }
}
