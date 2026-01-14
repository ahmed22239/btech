/**
 * Question:
 * Print Fibonacci series up to n terms.
 *
 * Explanation:
 * - Fibonacci starts with 0 and 1
 * - Next term = previous + current
 *
 * Example:
 * n = 5 → 0 1 1 2 3
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day05_Math_Logic;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n = 7; // number of terms
        int first = 0; // first Fibonacci number
        int second = 1; // second Fibonacci number

        System.out.print("Fibonacci Series: ");

        // loop to generate n terms
        for (int i = 1; i <= n; i++) {

            // print current number
            System.out.print(first + " ");

            // calculate next term
            int next = first + second;

            // shift values
            first = second;
            second = next;
        }
    }
}
