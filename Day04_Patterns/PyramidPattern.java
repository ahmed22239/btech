/**
 * Question:
 * Print a pyramid star pattern.
 *
 * Example (n = 4):
 
      *
     * *
    * * *
   * * * *
 
 * Explanation:
 * - First inner loop prints spaces
 * - Second inner loop prints stars
 * - Pyramid shape is formed using spacing logic
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day04_Patterns;

public class PyramidPattern {

    public static void main(String[] args) {
        int n = 4; // height of pyramid

        // loop for rows
        for (int i = 1; i <= n; i++) {

            // print space
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // print star
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            // next line
            System.out.println();
        }

    }

}
