/**
 * Question:
 * Find minimum and maximum among N numbers.
 *
 * Explanation:
 * - Assume first number as both min and max
 * - Compare remaining numbers and update
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day06_Input_EdgeCases;

public class MinMaxInN {

    public static void main(String[] args) {

        int[] numbers = { 12, 45, 7, 89, 23 };

        // assume first element as min and max
        int min = numbers[0];
        int max = numbers[0];

        // traverse array
        for (int i = 1; i < numbers.length; i++) {

            // update minimum
            if (numbers[i] < min) {
                min = numbers[i];
            }

            // update maximum
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }

        // print results
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }

}
