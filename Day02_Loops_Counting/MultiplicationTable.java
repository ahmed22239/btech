/**
 * Question:
 * Print the multiplication table of a given number.
 *
 * Explanation:
 * - Use a loop from 1 to 10
 * - Multiply the given number with loop counter
 * - Print each multiplication result
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day02_Loops_Counting;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

}
