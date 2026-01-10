/**
 * Question: Find largest of three numbers
 *
 * Explanation:
 * - Compare first number with other two
 * - If not largest, check second
 * - Else third is largest
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day01_Basic_Logic;

public class LargestOfThree {

    public static void main(String[] args) {
        int a = 10, b = 25, c = 30;

        if (a >= b && a >= c) {
            System.out.println(a + " is the Largest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the Largest number.");
        } else {
            System.out.println(c + " is the Largest number.");
        }
    }

}
