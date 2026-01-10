/**
 * Question: Print numbers from 1 to N
 *
 * Explanation:
 * - We use a loop because printing is repetitive
 * - Start loop from 1
 * - Stop loop when value reaches N
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day01_Basic_Logic;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 10; // upper limit

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " ");
        }
    }

}
