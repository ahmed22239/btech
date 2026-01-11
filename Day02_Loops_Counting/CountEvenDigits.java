/**
 * Question:
 * Count even digits in a number.
 *
 * Example:
 * Input: 123456
 * Output: 3 (2,4,6)
 *
 * Logic:
 * - Extract digit using % 10
 * - Check digit % 2 == 0
 * - Increment counter
 */

package Week01_Basics_Logic.Day02_Loops_Counting;

public class CountEvenDigits {

    public static void main(String[] args) {
        int number = 123456;
        int evenCount = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                evenCount++;
            }
            number = number / 10;
        }
        System.out.println("Count of even digits: " + evenCount);
    }

}
