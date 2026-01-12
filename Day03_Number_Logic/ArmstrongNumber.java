/**
 * Question:
 * Check whether a number is an Armstrong number.
 *
 * Explanation:
 * - First count total digits in the number
 * - Extract each digit
 * - Calculate digit power using loop 
 * - Add powered digits
 * - Compare sum with original number
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day03_Number_Logic;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 153; // input number
        int original = number; // store original number
        int sum = 0; // initialize sum of powers
        int digits = 0; // initialize digit count

        int temp = number;

        // Count number of digits
        while (temp > 0) {
            digits++;
            temp = temp / 10; // remove last digit
        }

        temp = number;

        // Calculate Armstrong sum
        while (temp > 0) {
            int digit = temp % 10; // get last digit
            int power = 1;

            // Calulate digit raised to the power of digit count
            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power; // add to sum
            temp = temp / 10; // remove last digit
        }

        // Check if sum equals original number
        if (sum == original) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

}
