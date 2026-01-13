/**
 * Question:
 * Print a square star pattern.
 *
 * Example (n = 4):
 
 * * * * 
 * * * *
 * * * *
 * * * *
 
 * Explanation:
 * - Outer loop controls rows
 * - Inner loop prints stars in each row
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day04_Patterns;

public class SquareStarPattern {
    public static void main(String[] args) {

        int n = 4; // number of rows and columns

        // loop for rows
        for (int i = 1; i <= n; i++) {

            // loop for columns
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            // move to next line
            System.out.println();
        }
    }

}
