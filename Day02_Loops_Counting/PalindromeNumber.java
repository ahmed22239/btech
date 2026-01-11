/**
 * Question:
 * Check whether a number is a palindrome.
 *
 * Explanation:
 * - Reverse the given number
 * - Compare the reversed number with the original number
 * - If both are equal, the number is palindrome
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day02_Loops_Counting;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        int original = number;
        int reversed = 0;

        while (number > 0) {
            reversed = reversed * 10 + (number % 10);
            number = number / 10;
        }
        if (original == reversed) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }

}
