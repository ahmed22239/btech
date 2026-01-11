/**
 * Question:
 * Count number of zeros in a given number.
 *
 * Example:
 * Input: 100200
 * Output: 4
 */

package Week01_Basics_Logic.Day02_Loops_Counting;

public class CountZeros {

    public static void main(String[] args) {

        int number = 100200;
        int zeroCount = 0;

        while (number > 0) {
            if (number % 10 == 0) {
                zeroCount++;
            }
            number = number / 10;
        }
        System.out.println("Count of zeros: " + zeroCount);
    }

}
