/**
 * Question: Check whether a year is a Leap Year
 *
 * Explanation:
 * - Year divisible by 4 → possible leap
 * - If divisible by 100 → not leap
 * - If divisible by 400 → leap
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day01_Basic_Logic;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2026;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

}
