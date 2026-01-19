/**
 * Question: Find missing number from 1 to N
 *
 * Example:
 * Input  : [1, 2, 4, 5], N = 5
 * Output : 3
 *
 * Explanation:
 * - Use sum formula of first N natural numbers
 * - Subtract actual array sum
 *
 * Algorithm:
 * 1. Calculate expected sum = N*(N+1)/2
 * 2. Calculate actual sum of array
 * 3. Missing number = expected - actual
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day10_Array_Searching;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5 };
        int n = 5; // Range is from 1 to 5

        // Calculate expected sum of first N natural numbers
        int expectedSum = n * (n + 1) / 2;

        // Calculate actual sum of array elements
        int actualSum = 0;
        for (int num : arr) {
            actualSum = actualSum + num;
        }

        // Missing number is the difference
        int MissingNumber = expectedSum - actualSum;

        System.out.println("Missing Number is :" + MissingNumber);
    }

}
