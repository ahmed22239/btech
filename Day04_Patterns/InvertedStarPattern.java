/**
 * Question:
 * Print an inverted star triangle pattern.
 *
 * Example (n = 4):
 
 * * * * 
 * * *
 * *
 *
 

 * Explanation:
 * - Outer loop controls rows
 * - Inner loop decreases number of stars each row
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day04_Patterns;

public class InvertedStarPattern {

    public static void main(String[] args) {

        int n = 4; // number of rows

        // loop for rows
        for (int i = n; i >= 1; i--) {

            // print star equal to i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // next line
            System.out.println();
        }

    }

}
