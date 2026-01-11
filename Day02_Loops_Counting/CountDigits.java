/**
 * Question:
 * Count total number of digits in a given number.
 *
 * Example:
 * Input: 1234567890
 * Output: 10
 *
 * Logic:
 * - Loop runs until number becomes 0
 * - Each iteration removes one digit
 * - Count loop iterations
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day02_Loops_Counting;

public class CountDigits {

    public static void main(String[] args) {
        int num = 1234567890;
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10; // Remove last digit
        }
        System.out.println("Total digits: " + count);
    }

}
