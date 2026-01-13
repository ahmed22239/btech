/**
 * Question:
 * Print a number triangle pattern.
 *
 * Example (n = 4):
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 *
 * Explanation:
 * - Outer loop controls rows
 * - Inner loop prints numbers from 1 to row number
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day04_Patterns;

public class NumberTriangle {

    public static void main(String[] args) {

        int n = 4; // number of rows

        // loop for rows
        for (int i = 1; i <= n; i++) {

            // print number form 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // move to next line
            System.out.println();
        }
    }

}
