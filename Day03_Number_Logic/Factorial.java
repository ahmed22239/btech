/**
 * Question:
 * Find the factorial of a given number.
 *
 * Explanation:
 * - Factorial of n is n * (n-1) * (n-2) ... * 1
 * - Use a loop to multiply numbers from 1 to n
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day03_Number_Logic;

public class Factorial {

    public static void main(String[] args) {

        int number = 5; // number to find factorial
        long factorial = 1; // to store factorial result

        // multiply numbers from 1 to number
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial + ".");
    }

}
