/**
 * Question: Prefix Sum Array
 *
 * Example:
 * Input  : [2, 4, 6, 8]
 * Prefix : [2, 6, 12, 20]
 *
 * Explanation:
 * - prefix[i] stores sum of elements from index 0 to i
 * - Used to calculate range sum efficiently
 *
 * Range Sum Formula:
 * sum(l, r) = prefix[r] - prefix[l - 1]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week02_Arrays.Day12_Array_Optimization;

public class PrefixSum {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8 };

        int[] prefix = new int[arr.length]; // Prefix Sum Array

        prefix[0] = arr[0]; // First element is same as original array

        // Constructing Prefix Sum Array
        for (int i = 1; i < arr.length; i++) {

            // Current prefix sum is previous prefix sum + current element
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Example Range Sum Query
        int l = 1; // Starting index
        int r = 3; // Ending index

        // Calculating range sum using prefix sum array
        int rangeSum = prefix[r] - prefix[l - 1];

        // Output the result
        System.out.println("Range Sum from index " + l + " to " + r + " is: " + rangeSum);
    }

}
