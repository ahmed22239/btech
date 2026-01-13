/**
 * Question:
 * Print a right-angled triangle star pattern.
 *
 * Example (n = 5):
 
 * 
 * *
 * * *
 * * * *
 * * * * *
 
 * Explanation:
 * - Outer loop controls rows
 * - Inner loop prints stars equal to row number
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day04_Patterns;

public class RightTrianglePattern {
    public static void main(String[] args) {

        int n = 5; // number of rows

        // loop for rows
        for (int i = 1; i <= n; i++) {

            // print stars equal to row count
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // next line after each row
            System.out.println();
        }
    }

}
