/**
 * Question:
 * Reverse a given number.
 *
 * Explanation:
 * - Extract the last digit using % 10
 * - Build the reversed number using multiplication by 10
 * - Remove the last digit using / 10
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day02_Loops_Counting;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10; // Get last digit
            reversed = reversed * 10 + digit; // Append digit
            num = num / 10; // Remove last digit
        }
        System.out.println("Reversed Number: " + reversed);
    }

}
