/**
 * Question:
 * Swap two numbers without using a third variable.
 *
 * Explanation:
 * - Use arithmetic operations to swap values
 * - a = a + b
 * - b = a - b
 * - a = a - b
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day06_Input_EdgeCases;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        // print before swap
        System.out.println("Before Swap : a = " + a + ", b = " + b);

        // swap logic
        a = a + b;
        b = a - b;
        a = a - b;

        // print after swap;
        System.out.println("After Swap : a = " + a + " , b = " + b);
    }

}
