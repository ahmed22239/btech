/**
 * Question: Find sum of first N natural numbers
 *
 * Explanation:
 * - Initialize sum = 0
 * - Loop from 1 to N
 * - Add each number to sum
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day01_Basic_Logic;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        // Loop to add numbers
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }

}
