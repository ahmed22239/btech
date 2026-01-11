/**
 * Question:
 * Find the sum of digits of a given number.
 *
 * Explanation:
 * - Extract digits one by one using % 10
 * - Add each digit to the sum
 * - Remove digits using / 10
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day02_Loops_Counting;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }
}