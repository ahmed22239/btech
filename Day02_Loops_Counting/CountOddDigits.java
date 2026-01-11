/**
 * Question:
 * Count odd digits in a number.
 *
 * Example:
 * Input: 123456
 * Output: 3 (1,3,5)
 */

package Week01_Basics_Logic.Day02_Loops_Counting;

public class CountOddDigits {

    public static void main(String[] args) {
        int number = 123456;
        int oddCount = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 != 0) {
                oddCount++;
            }
            number = number / 10;
        }
        System.out.println("Count of odd digits: " + oddCount);

    }

}
